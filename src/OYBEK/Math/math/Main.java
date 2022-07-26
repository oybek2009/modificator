package OYBEK.Math.math;


import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;


public class Main {
    public static Math math = new Math();
    public static Scanner scanner = new Scanner(in);
    public static Random random = new Random();
    public static int answer;
    public static int countT = 0;
    public static int countN = 0;

    public static void main(String[] args) {
        // write your code here

        while (true) {
            System.out.println("1->Sign in");
            System.out.println("2->Sign up");
            System.out.println("3-> Exit");
            System.out.print("= ");
            int t = scanner.nextInt();

            if (t == 1) {

                String a1[] = new String[100];
                int b1[] = new int[100];
                int count = 0;

                int res = 0;

                System.out.println("4-> Start game");
                System.out.println("5-> Rating");
                System.out.print("= ");
                int n = scanner.nextInt();
                switch (n) {
                    case 4 -> {
                        System.out.print("Name: ");
                        scanner = new Scanner(in);
                        String name = scanner.nextLine();
                        for (int i = 0; i < 3; i++) {
                            int a = random.nextInt(10);
                            int b = random.nextInt(10);
                            int c = random.nextInt(4);
                            math.test(a, b, c);
                            answer = scanner.nextInt();

                            if (answer == math.res) {
                                countT++;
                            } else {
                                countN++;
                            }
                        }
                        a1[count] = name;
                        b1[count] = countT;
                        count++;
                    }
                    case 5 -> {
                        System.out.println("===Rating===");
                        for (int i = 0; i < count; i++) {
                            System.out.println(a1[i]);
                            System.out.println(b1[i]);
                            count++;
                        }

                    }
                }
            } else if (t == 2) {
                int id1 = 123456789;
                System.out.print("Id: ");
                int id2 = scanner.nextInt();
                if (id1 == id2) {
                    int parol = 2213;
                    System.out.print("Password: ");
                    int a = scanner.nextInt();
                    System.out.print("Repeat password: ");
                    int r = scanner.nextInt();
                    if (r == parol) {
                        System.out.println("Siz ro`yhatdan muvofaqqiyatli o`tdingiz!!!!");
                    } else {
                        System.out.println("Error password!!!");
                        break;
                    }
                }

            }else if (t == 3){
                System.out.println("Programma stop");
                break;
        }else {
                System.out.println("Error!!!");
                break;
            }
    }
}
}


