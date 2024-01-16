package ru.innopolis.homework013.Utils;

import java.util.Scanner;
import java.util.UUID;

import static ru.innopolis.homework013.Utils.InputData.*;

public class App {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        System.out.println("Введите данные:");
        String input = inputData.next();
//        System.out.println(UUID.randomUUID());
//         InputData newInputData= new InputData();

        try {
            parseCount(input);
            System.out.println(input);
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        }
//        parseCount(input);
//        inputData.nextLine();
//        System.out.println(input);

        validateCount(input);
//        inputData.nextLine();
        System.out.println(input);

        parseNumber(input);
//        inputData.nextLine();
        System.out.println(input);

        validateNumber(input);
//        inputData.nextLine();
        System.out.println(input);
    }
}
