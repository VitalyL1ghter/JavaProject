package ru.innopolis.homework05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minCount = 0;
        int maxCount = 10;
        Televisor[] newTele = new Televisor[maxCount];

        for (int i = minCount; i < maxCount; i++) {
            System.out.println("Введите модель телевизора :" + (i + 1));
            String model = scanner.next();
            System.out.println("Введите номер включенного канала :");
            int chanell = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Введите уровень звука от 0 до 100 :");
            int volume = scanner.nextInt();
            System.out.println("Включен ли телевизор ? Да или Нет) :");
            String turnOnS = scanner.next();
            boolean turnOn = turnOnS.equalsIgnoreCase("Да");
            newTele[i] = new Televisor(model, chanell, volume, turnOn);
            System.out.println(newTele[i]);

        }
        System.out.println("Список веденных телевизоров ");
        for (Televisor s : newTele) {
            System.out.println(s);
        }
        System.out.println("Список включенных телевизоров с громкостью от 50 до 100 : ");
        for (Televisor TV : newTele) {
            if (TV.getVolume() >= 50 && TV.getVolume() <= 100 && TV.isTurnOn()) {
                System.out.println(TV.getModel());
            }
        }
        System.out.println("Список телевизоров с влюченными каналами по возрастанию :");

        Arrays.sort(newTele, new Comparator<Televisor>() {
            public int compare(Televisor o1, Televisor o2) {
                return o1.getChanell() - o2.getChanell();
            }
        });
        for (Televisor s : newTele) {
            System.out.println(s);
        }

    }
}























