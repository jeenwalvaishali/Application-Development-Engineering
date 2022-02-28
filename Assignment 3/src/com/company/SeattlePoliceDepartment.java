package com.company;

import java.util.ArrayList;

public class SeattlePoliceDepartment{

    ArrayList<Person> persons;
    String notification;

    public SeattlePoliceDepartment() {
        this.persons = new ArrayList<>();
    }

    public void notifyCitizens(String notification){
        this.notification = notification;
        for (Person person: persons ){
             person.getNotification(this);
        }
    }
}
