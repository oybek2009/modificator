package OYBEK.Math.car;

public class Car implements CarInt {
    String name;
    int year;
    String brand;

    public Car(String name, int year, String brand) {
        this.name = name;
        this.year = year;
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Start");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }

    @Override
    public void print() {
        System.out.println("Name: " +name);
        System.out.println("Year: " +year);
        System.out.println("Brand: " +brand);
    }
    public void motor(){
        System.out.println("Motor: " + "Diesel");
    }
}
