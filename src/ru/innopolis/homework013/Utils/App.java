package ru.innopolis.homework013.Utils;
import java.util.Scanner;

import static ru.innopolis.homework013.Utils.InputData.*;
public class App {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Введите данные:");
        String input = inputData.next();

        try {
            parseCount(input);
            System.out.println(input);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            validateCount(input);
            System.out.println(input);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            parseNumber(input);
            System.out.println(input);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            validateNumber(input);
            System.out.println(input);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
