package com.ws.model.transfer;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by user on 7/7/2017.
 */
@XmlRootElement
public class Person {
    private String personId;
    private String name;

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
