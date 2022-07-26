package OYBEK.Math.regitration;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

public class Registration implements Regist {

    String name;
    String password;
    static String[] arrLogin = new String[100];
    static String[] arrPassword = new String[100];
    int count = 0;

    boolean isHave = false;

    Scanner scanner = new Scanner(in);

    @Override
    public void add() {

        System.out.println(" Sign up");
        System.out.print("Name write: ");
        String name = scanner.nextLine();
        System.out.print("Password write: ");
        String password = scanner.nextLine();

        arrLogin[count] = name;
        arrPassword[count] = password;
        count++;
    }

    @Override
    public void search() {
        System.out.println(" Search ");
        System.out.print("Name write: ");
        String s = scanner.nextLine();
        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrLogin[i], s)) {
                isHave = true;
                break;
            }

        }
        if (isHave) {
            System.out.println("Bor");
        } else {
            System.out.println("Yo`q");
        }
    }

    @Override
    public void signIn() {
        System.out.println(" Sign In ");
        System.out.print("Name write: ");
        String name = scanner.nextLine();
        System.out.print("Password write: ");
        String password = scanner.nextLine();

        for (int i = 0; i < count; i++) {
            if (Objects.equals(arrLogin[i], name) && Objects.equals(arrPassword[i], password)) {
                isHave = true;
                break;

            }
        }
        if (isHave) {
            System.out.println("Tizimga xush kelibsiz");
        } else {
            System.out.println("Login or Password error!!!");
        }


    }

    @Override
    public void list() {

        System.out.println(" List ");
        for (int i = 0; i < count; i++) {
            System.out.println(arrLogin[i]);
            System.out.println(arrPassword[i]);

        }
            }
        }

