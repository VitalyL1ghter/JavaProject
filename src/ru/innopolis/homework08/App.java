package ru.innopolis.homework08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {

        Scanner s = new Scanner(new File("C:\\Users\\l1\\IdeaProjects\\JavaProject\\src\\ru\\innopolis\\homework08\\Person.txt"));
        ArrayList<Person> personList = new ArrayList<Person>();
        while (s.hasNextLine()) {
            String[] line = s.nextLine().split("=");
            personList.add(new Person(line[0], Double.parseDouble(line[1])));
        }
        s.close();
        System.out.println(personList);

        s = new Scanner(new File("C:\\Users\\l1\\IdeaProjects\\JavaProject\\src\\ru\\innopolis\\homework08\\Product.txt"));
        ArrayList<Product> productList = new ArrayList<Product>();
        while (s.hasNextLine()) {
            String[] line = s.nextLine().split("=");
            productList.add(new Product(line[0], Double.parseDouble(line[1])));
        }
        s.close();
        System.out.println(productList);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\l1\\IdeaProjects\\JavaProject\\src\\ru\\innopolis\\homework08\\Result.txt");


        for (Person d : personList) {
            String buyerString = "Покупает: " + d.getName();
            System.out.println(buyerString);
            writeFile(outputStream, buyerString);
            if (d.getCash() < 0) {
                String str = "Отрицательное число денег";
                System.out.println("Отрицательное число денег");
                writeFile(outputStream, str);
                continue;
            }
            if (d.getCash() == 0) {
                String str = "Нет денег";
                System.out.println("Нет денег");
                writeFile(outputStream, str);
                continue;
            }
            try {
                for (int i = 0; i < 3; i++) {
                    Product product = productList.get((int) (Math.random() * productList.size()));
                    d.byuProduct(product);
                    String buyString = "Купил: " + product.getProductName();
                    System.out.println(buyString);
                    writeFile(outputStream, buyString);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                writeFile(outputStream, ex.getMessage());
            }
        }
    }

    private static void writeFile(FileOutputStream outputStream, String ex) throws IOException {
        outputStream.write(ex.getBytes());
        outputStream.write(System.lineSeparator().getBytes());
    }
}






