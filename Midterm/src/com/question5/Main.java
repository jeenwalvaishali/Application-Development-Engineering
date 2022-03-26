package com.question5;

public class Main {

    public static void main(String[] args){

        Camera camera1 = Camera.getInstance();
        camera1.setCameraName("This is the first camera");
        System.out.println(camera1.getCameraName());

        Camera camera2 = Camera.getInstance();
        camera2.setCameraName("This is the second camera");
        System.out.println(camera1.getCameraName());

    }

}
