package org.example;

import javax.xml.ws.Endpoint;

public class ServerApp {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/ws/contact", new ContactService());
        System.out.println("Service is running at http://localhost:8080/ws/contact?wsdl");
    }
}
