package lt.viko.eif.kskrebe.client;

import lt.viko.eif.kskrebe.client.generated.Car;
import lt.viko.eif.kskrebe.client.generated.CarService;
import lt.viko.eif.kskrebe.client.generated.CarServiceImplService;
import lt.viko.eif.kskrebe.client.generated.Part;

import java.util.List;

/**
 * Simple SOAP client for CarService.
 */
public class CarClient {

    public static void main(String[] args) {
        CarServiceImplService service = new CarServiceImplService();
        CarService port = service.getCarServiceImplPort();

        System.out.println("=== ALL CARS ===");
        List<Car> cars = port.getAllCars();

        for (Car car : cars) {
            printCar(car);
            System.out.println("--------------------");
        }

        System.out.println("=== CAR BY ID (1) ===");
        Car car = port.getCarById(1);
        if (car != null) {
            printCar(car);
        } else {
            System.out.println("Car not found.");
        }
    }

    private static void printCar(Car car) {
        System.out.println("ID: " + car.getId());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Electric: " + car.isElectric());
        System.out.println("Category: " + car.getCategory());

        if (car.getParts() != null && !car.getParts().getPart().isEmpty()) {
            System.out.println("Parts:");
            for (Part part : car.getParts().getPart()) {
                System.out.println(" - " + part.getId() + ": " + part.getName() + " (" + part.getPrice() + ")");
            }
        } else {
            System.out.println("Parts: none");
        }
    }
}