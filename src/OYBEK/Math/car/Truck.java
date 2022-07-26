package OYBEK.Math.car;

public class Truck extends Car {
    int tonna;

    public Truck(String name, int year, String brand, int tonna) {
        super(name, year, brand);
        this.tonna = tonna;
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
        System.out.println("Brand: " + brand);
        System.out.println("Tonna: " +tonna);
    }
    public void location(){
        System.out.println("Location: " + "Toshkent");
    }
}
