package ru.innopolis.homework04;

import java.util.Arrays;
import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);
        System.out.println("Введите 1 слово на английском языке: ");
        String w1 = word.next();
        System.out.println("Введите 2 слово на английском языке: ");
        var w2 = word.next();
        System.out.println("Введенные слова: " + w1 + " " + w2);
        char[] charArray = w1.toCharArray();
        Arrays.sort(charArray);
        var sortedw1 = new String(charArray);
        char[] charArray1 = w2.toCharArray();
        Arrays.sort(charArray1);
        var sortedw2 = new String(charArray1);

        System.out.println("Результат сортировки: " + sortedw1 + " " + sortedw2);
        word.close();
    }

}




