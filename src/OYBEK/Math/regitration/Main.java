package OYBEK.Math.regitration;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {

        Registration registration = new Registration();
        Scanner scanner = new Scanner(in);

        while (true) {
            System.out.println("1->Sign up");
            System.out.println("2->Sign in");
            System.out.println("3->Search");
            System.out.println("4->List");
            System.out.print("= ");
            int n = scanner.nextInt();
            switch (n) {
                case 1->{
                    registration.add();
                }
                case 2->{
                    registration.signIn();
                }
                case 3->{
                    registration.search();
                }
                case 4->{
                    registration.list();
                }
            }

        }

    }
}

