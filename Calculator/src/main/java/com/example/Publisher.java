package com.example;

import jakarta.xml.ws.Endpoint;

public class Publisher {

    public static void main(String[] args) {

        String url = "http://localhost:8081/ws/Calculator";

        Endpoint.publish(url, new CalculatorImpl());

        System.out.println("WSDL: " + url + "?wsdl");
    }
}