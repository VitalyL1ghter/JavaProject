package ru.innopolis.homework012;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        DateFormat dateOfBirth = new SimpleDateFormat("dd.MM.yyyy");
        Scanner personCountScanner = new Scanner(System.in);
        System.out.println("Введите количество человек, заносимых в БД");
        int minCount = 0;
        int checkMaxCount;
        while (true) {
            checkMaxCount = personCountScanner.nextInt();
            if (checkMaxCount <= 0) {
                System.out.println("Введены не правильные данные, попробуйте еще раз");
            } else break;
        }

        List<Person> personList = new ArrayList<>();

        while (minCount < checkMaxCount) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите Фамилия Имя Отчество дата рождения (в формате: день.месяц.год) " +
                    "номер телефона ( в формате 8XXXXXXXXXX) пол (f или m) возраст, разделяя пробелом");
            String personInfo = scanner.nextLine();
            String[] inputPersonInfo = personInfo.split("\\s+");

            try {
                Person newPerson = new Person();
                newPerson.setLastName(inputPersonInfo[0]);
                newPerson.setFirstName(inputPersonInfo[1]);
                newPerson.setPatronymic(inputPersonInfo[2]);
                newPerson.setDateOfBirth(dateOfBirth.parse(inputPersonInfo[3]));
                if (!Pattern.matches("[0-9]+", inputPersonInfo[4])) {
                    throw new InputMismatchException("Номер телефона должен состоять из цифр от 0 до 9");
                }
                newPerson.setPhoneNumber(Long.parseLong(inputPersonInfo[4]));
                newPerson.setGender(inputPersonInfo[5]);
                newPerson.setAge(Integer.parseInt(inputPersonInfo[6]));
                personList.add(newPerson);
                System.out.println(newPerson);

            } catch (ParseException s) {
                System.out.println("Не верный формат даты рождения: dd.mm.yyyy");

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());

            } finally {
                minCount++;
            }
        }
        personList.forEach(System.out::println);
    }
}




