package lt.viko.eif.kskrebe.server.repository;

import lt.viko.eif.kskrebe.server.db.DatabaseUtil;
import lt.viko.eif.kskrebe.server.model.Car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for car database operations.
 */
public class CarRepository {

    private final PartRepository partRepository = new PartRepository();

    /**
     * Finds all cars with their parts.
     *
     * @return list of cars
     */
    public List<Car> findAll() {
        List<Car> cars = new ArrayList<>();

        String sql = "SELECT id, brand, model, production_year, electric, category FROM car ORDER BY id";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Car car = mapCar(resultSet);
                car.setParts(partRepository.findByCarId(car.getId()));
                cars.add(car);
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to load cars.", e);
        }

        return cars;
    }

    /**
     * Finds a car by its identifier.
     *
     * @param id car identifier
     * @return car or null if not found
     */
    public Car findById(int id) {
        String sql = "SELECT id, brand, model, production_year, electric, category FROM car WHERE id = ?";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, id);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    Car car = mapCar(resultSet);
                    car.setParts(partRepository.findByCarId(car.getId()));
                    return car;
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to load car with id: " + id, e);
        }

        return null;
    }

    private Car mapCar(ResultSet resultSet) throws Exception {
        Car car = new Car();
        car.setId(resultSet.getInt("id"));
        car.setBrand(resultSet.getString("brand"));
        car.setModel(resultSet.getString("model"));
        car.setYear(resultSet.getInt("production_year"));
        car.setElectric(resultSet.getBoolean("electric"));

        String categoryValue = resultSet.getString("category");
        car.setCategory(categoryValue);

        return car;
    }
}