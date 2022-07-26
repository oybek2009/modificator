package OYBEK.Math.If;

import java.util.Scanner;

import static java.lang.System.in;

public class If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);


        int[] array = {10,20,30};
        int max = array[0];
        int count =  0;
        for (int a : array) {
            count += max;
        }
        System.out.println(count);


        for (int j : array) {
            if (max < j) {
                max = j;


            }
        }
        int min = array[0];
        for (int j : array) {
            if (min > j) {
                min = j;

            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

    }
}


