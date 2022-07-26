package OYBEK.Math.car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("Car",2000,"Audi");
        car.print();
        car.motor();
        car.start();
        car.stop();
        System.out.println("-------");
        Ford ford = new Ford("Ford",2015,"Mers",160);
        ford.print();
        ford.motor();
        ford.start();
        ford.stop();
        System.out.println("-------");
        Bmw bmw = new Bmw("BMW",2022,"BMW",300);
        bmw.print();
        bmw.motor();
        bmw.start();
        bmw.stop();
        System.out.println("-------");
        Truck truck = new Truck("Truck",2013,"Man",15);
        truck.print();
        truck.location();
        truck.start();
        truck.stop();
    }
}
