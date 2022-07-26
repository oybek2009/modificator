package OYBEK.Math.Vehicle;


public class Vehicle {

    String name;
    String color;
    int MAX_VEHICLES_PEED = 300;
    float currentSpeed = 0;
    Vehicle(String a, String b) {

    }

    public Vehicle() {
    }

    void increaseSpeedBy(float f) {

    }

    String getName() {
        System.out.println("Vehicle");
        return getName();
    }
    String getColor(){
         System.out.println("Black");
         return getColor();
    }
    float getCurrentSpeed(){
        System.out.println(200);
        return getCurrentSpeed();
    }
    public void print() {
        System.out.println("Name: " +getName());
        System.out.println("Color: " +getColor());
        System.out.println("CurrentSpeed: " +getCurrentSpeed());
    }


}

