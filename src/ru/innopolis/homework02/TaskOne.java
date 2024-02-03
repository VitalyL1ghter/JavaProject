package ru.innopolis.homework02;

import java.util.Scanner;

public class TaskOne {

    public static void main(String[] args) {

        Scanner far = new Scanner(System.in);
                System.out.print("Введите степень в градусах Фаренгейта: ");
                double x = far.nextInt();
var y = (x-32)/1.8;
        System.out.println(x + " градусов по Фаренгейту равно: " + y + " градусов по Цельсию");

    }
}
