package ru.innopolis.homework02;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {
        System.out.println("Исходная строка: JAVA");
        Scanner print = new Scanner(System.in);
        System.out.print("Сколько раз вывести строку ? ");
        int x = print.nextInt();
               System.out.print("После повторения " + x + " раз: ");
               int i;
        for (i = 0; i < x; i++) {
            System.out.print("Java");
        }
    }
}
