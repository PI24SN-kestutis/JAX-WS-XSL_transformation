package lt.viko.eif.kskrebe.server.model;

import jakarta.xml.bind.annotation.*;

import java.util.List;
import java.util.Objects;

/**
 * Represents a car entity.
 */
@XmlRootElement(name = "car")
@XmlAccessorType(XmlAccessType.FIELD)
public class Car {

    private int id;
    private String brand;
    private String model;
    private int year;
    private boolean electric;
    private String category;

    @XmlElementWrapper(name = "parts")
    @XmlElement(name = "part")
    private List<Part> parts;

    public Car() {
    }

    public Car(int id, String brand, String model, int year, boolean electric, String category, List<Part> parts) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.electric = electric;
        this.category = category;
        this.parts = parts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isElectric() {
        return electric;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Part> getParts() {
        return parts;
    }

    public void setParts(List<Part> parts) {
        this.parts = parts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", electric=" + electric +
                ", category=" + category +
                ", parts=" + parts +
                '}';
    }
}