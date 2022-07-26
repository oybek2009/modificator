package OYBEK.Math.car;

public class Ford extends Car {
    int speed;

    public Ford(String name, int year, String brand, int speed) {
        super(name, year, brand);
        this.speed = speed;
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
        System.out.println("Speed: " +speed);
    }
    public void motor(){
        System.out.println("Motor: " + "Diesel");
    }
}
