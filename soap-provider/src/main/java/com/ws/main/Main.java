package com.ws.main;

import com.ws.endpoint.HelloWorldImpl;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
    }
}
