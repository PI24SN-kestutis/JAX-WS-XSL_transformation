package lt.viko.eif.kskrebe.server.service;

import jakarta.jws.WebService;
import lt.viko.eif.kskrebe.server.model.Car;
import lt.viko.eif.kskrebe.server.repository.CarRepository;

import java.util.List;

/**
 * SOAP web service implementation for car operations.
 */
@WebService(endpointInterface = "lt.viko.eif.kskrebe.server.service.CarService") //WSDL pagal interfeisą
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository = new CarRepository();

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public Car getCarById(int id) {
        return carRepository.findById(id);
    }
}