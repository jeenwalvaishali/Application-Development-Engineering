package com.company;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        if(!seattlePoliceDepartment.persons.contains(this)){
            seattlePoliceDepartment.persons.add(this);
        }
    }

    public void unsubscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        if(seattlePoliceDepartment.persons.contains(this)){
            seattlePoliceDepartment.persons.remove(this);
        }
    }

    public void getNotification(SeattlePoliceDepartment seattlePoliceDepartment){
            System.out.println("Person's name: " + this.name);
            System.out.println("Person's age: " + this.age);
            System.out.println("Seattle police department notification: " + seattlePoliceDepartment.notification);
    }
}
