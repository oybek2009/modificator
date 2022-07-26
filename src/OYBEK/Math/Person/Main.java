package OYBEK.Math.Person;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Tom",20);
        person.print();
        person.learn();
        person.walk();
        person.eat();
        System.out.println("---------");
        Programmer programmer = new Programmer("Ali",22,"IT Park");
        programmer.print();
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("---------");
        Dancer dancer = new Dancer("Ben",19,"Dancers");
        dancer.print();
        dancer.dancing();
        dancer.learn();
        dancer.walk();
        dancer.eat();
        System.out.println("---------");
        Singer singer = new Singer("Karim",24,"Singers");
        singer.print();
        singer.playGitar();
        singer.singing();
        singer.learn();
        singer.walk();
        singer.eat();
    }
}
