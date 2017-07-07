package com.ws.endpoint;


import com.ws.model.transfer.Person;

import javax.jws.WebService;

@WebService(endpointInterface = "com.ws.endpoint.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    public String getHelloWorldAsString(String name) {
        return "Hello World JAX-WS-server " + name;
    }

    public Person findPerson(String username) {
        Person p = new Person();
            p.setName("JORGE");
            p.setPersonId("23443");
        return p;
    }

}