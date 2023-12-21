package ru.innopolis.homework04;

import java.util.Scanner;
import java.lang.String;

public class TaskOne {

    public static void main(String[] args) {

        String alph = "qwertyuiopasdfghjklzxcvbnm";
        Scanner keyb = new Scanner(System.in);
        System.out.println("Введите букву английского алфавита: ");
        String x = keyb.next();
         int index1 = alph.indexOf(x);
         if(index1==0) {
             System.out.println("Соседняя буква слева от " + x + " - " + alph.charAt(25));
         } else {
              System.out.println("Соседняя буква слева от " + x + " - " + alph.charAt(index1-1));
        }

    }

}

