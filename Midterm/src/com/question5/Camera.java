package com.question5;

public class Camera {

    private static Camera __instance;
    private static Object obj = new Object();
    private String  camName = " ";

    private Camera(){
    }

    public String getCameraName(){
        return camName;
    }

    public void setCameraName(String camName){
        this.camName = camName;
    }

    public static Camera getInstance(){
        if(__instance == null){
            synchronized (obj){
                if (__instance == null){
                    __instance = new Camera();
                }
            }
        }
        return __instance;
    }
}
