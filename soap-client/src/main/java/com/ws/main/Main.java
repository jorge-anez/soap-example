package com.ws.main;

import com.ws.model.transfer.Person;
import com.ws.endpoint.HelloWorld;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("Hello World!");
        URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://endpoint.ws.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

        Person p = hello.findPerson("jorge");
        System.out.println(hello.getHelloWorldAsString("JORGE"));
        System.out.println(p.getName());
        System.out.println(p.getPersonId());

    }

}
