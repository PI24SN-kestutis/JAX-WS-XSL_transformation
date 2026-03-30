package lt.viko.eif.kskrebe.server.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import lt.viko.eif.kskrebe.server.model.Car;

import java.util.List;

/**
 * SOAP web service contract for car operations.
 */
@WebService
public interface CarService {

    /**
     * Returns all cars with their parts.
     *
     * @return list of cars
     */
    @WebMethod
    List<Car> getAllCars();

    /**
     * Returns a car by its identifier.
     *
     * @param id car identifier
     * @return car or null if not found
     */
    @WebMethod
    Car getCarById(int id);
}