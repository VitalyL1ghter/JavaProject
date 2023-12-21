package ru.innopolis.homework02;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner numone = new Scanner(System.in);
        System.out.print("введите первое целое число ");
        int x = numone.nextInt ();
        Scanner numtwo = new Scanner(System.in);
        System.out.print("введите второе целое число ");
        int y = numtwo.nextInt();
        System.out.println("Сумма двух целых чисел: " + (x+y));
        System.out.println("Разница двух целых чисел: " + (x-y));
        System.out.println("Произведение двух целых чисел: " + (x*y));
        float z = (float) (x + y) /2;
        System.out.println("Среднее из двух целых чисел: " + z);
if (x>y) {
    System.out.println("Растояние двух целых чисел: " + (x-y));
    } else if (x<y)   {
    System.out.println("Растояние двух целых чисел: " + (y-x));
        }

        if (x>y) {
            System.out.println("Максимальное целое число: " + x);
            System.out.println("Минимальное целое число: " + y);
        } else {
            System.out.println("Максимальное целое число: " + y);
            System.out.println("Минимальное целое число: " + x);
        }

    }

}
