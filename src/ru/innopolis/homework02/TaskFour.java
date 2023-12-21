package ru.innopolis.homework02;

import java.util.Scanner;


public class TaskFour {

    public static void main(String[] args) {

        Scanner r1 = new Scanner(System.in);
            System.out.print("Введите число строк и столбцов сетки: "); // ввод размера сетки
        int x = r1.nextInt();

        Scanner r2 = new Scanner(System.in);
        System.out.print("Введите повторяемый элемент сетки: "); // ввод символа
        String z = r2.next();
        String[][] arr = new String[x][x]; // двумерный массив

        System.out.println("Сетка по запросу " + x + " на " + x);

            for (int i=0; i<x; i++) {    // идем по строкам
                for (int j=0; j<x; j++) { // идем по столбцам
                    arr[i][j] = z;
                    System.out.print(arr[i][j]);
                }
                System.out.println();
        }
    }
}





