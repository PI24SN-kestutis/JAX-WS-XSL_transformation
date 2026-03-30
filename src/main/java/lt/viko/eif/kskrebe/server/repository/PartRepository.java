package lt.viko.eif.kskrebe.server.repository;

import lt.viko.eif.kskrebe.server.db.DatabaseUtil;
import lt.viko.eif.kskrebe.server.model.Part;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Repository for part database operations.
 */
public class PartRepository {

    /**
     * Finds all parts belonging to a specific car.
     *
     * @param carId car identifier
     * @return list of parts
     */
    public List<Part> findByCarId(int carId) {
        List<Part> parts = new ArrayList<>();

        String sql = "SELECT id, name, price FROM part WHERE car_id = ? ORDER BY id";

        try (Connection connection = DatabaseUtil.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, carId);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    Part part = new Part();
                    part.setId(resultSet.getInt("id"));
                    part.setName(resultSet.getString("name"));
                    part.setPrice(resultSet.getFloat("price"));

                    parts.add(part);
                }
            }

        } catch (Exception e) {
            throw new RuntimeException("Failed to load parts for car id: " + carId, e);
        }

        return parts;
    }
}