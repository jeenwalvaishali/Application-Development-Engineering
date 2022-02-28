package com.company;

//1. Create a class called SeattlePoliceDepartment
//2. Create a method called NotifyCitizens which will take a String as argument. This string will be any public notification they want all the citizens to know about
//3. Create a class called Person, which will have Name and age as properties. also create a subscribe and unsubscribe functions which will take SeattlePoliceDepartment as argument. Create a method getNotification which will take SeattlePoliceDepartment as argument
//4. In the main function create one instance of SeattlePoliceDepartment This will be publisher
//5. Create 3-4 instances of person.
//6. Subscribe some persons to SeattlePoliceDepartment
//7. Publish a message from SeattlePoliceDepartment
//8. Unsubscribe 1 or 2 users from SeattlePoliceDepartment
//10. Publish the message again.


public class Main {

    public static void main(String[] args) {

        SeattlePoliceDepartment seattlePoliceDepartment = new SeattlePoliceDepartment();
        Person vaishali = new Person("Vaishali",29);
        Person swapnali = new Person("swapnali", 28);
        Person mayank = new Person("Mayank", 29);
        Person tushar = new Person("Tushar", 27);

        vaishali.subscribe(seattlePoliceDepartment);
        swapnali.subscribe(seattlePoliceDepartment);
        mayank.subscribe(seattlePoliceDepartment);

        seattlePoliceDepartment.notifyCitizens("Westlake harisson street is under maintenance, four wheelers are prohibited to that route");

        vaishali.unsubscribe(seattlePoliceDepartment);
        mayank.unsubscribe(seattlePoliceDepartment);
        tushar.subscribe(seattlePoliceDepartment);
        System.out.println("*************************************************************");
        System.out.println("New Notification");
        seattlePoliceDepartment.notifyCitizens("Westlake harisson street is open now");

    }
}
