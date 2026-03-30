package lt.viko.eif.kskrebe.server.publisher;

import jakarta.xml.ws.Endpoint;
import lt.viko.eif.kskrebe.server.db.DatabaseMigrationRunner;
import lt.viko.eif.kskrebe.server.service.CarServiceImpl;

/**
 * Publishes the SOAP web service endpoint.
 */
public class CarServicePublisher {

    public static void main(String[] args) {
        new DatabaseMigrationRunner().migrate();

        String address = "http://localhost:8080/carservice";
        Endpoint.publish(address, new CarServiceImpl());

        System.out.println("Car SOAP service started.");
        System.out.println("WSDL available at:");
        System.out.println(address + "?wsdl");
    }
}