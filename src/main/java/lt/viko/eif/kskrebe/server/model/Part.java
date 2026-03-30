package lt.viko.eif.kskrebe.server.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Objects;

/**
 * Represents a car part entity.
 */
@XmlRootElement(name = "part")
@XmlAccessorType(XmlAccessType.FIELD)
public class Part {

    private int id;
    private String name;
    private float price;

    public Part() {
    }

    public Part(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override //objektai su tuo pačiu ID = tas pats objektas
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Part)) return false;
        Part part = (Part) o;
        return id == part.id;
    }

    @Override //dedant į kolekcija lyginami hashCode
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Detalė: [" +
                "id=" + id +
                ", pavadinimas="+ "'" + name + "'" + ", kaina='" + price +"']";
    }
}