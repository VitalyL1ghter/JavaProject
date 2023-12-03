package ru.innopolis.homework07Addition;

import java.util.Iterator;
import java.util.List;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        List<Product> products = List.of(new Product("Хлеб", 40.0),
                new Product("Молоко", 60.0),
                new DiscountProduct("Торт", 800.0, 15.0),
                new DiscountProduct("Кофе растворимый", 432.0, 50.0),
                new Product("Мороженное", 200.0),
                new Product("Макароны", 800.0));
        System.out.println("Список продуктов с ценами :");
        Iterator var2 = products.iterator();

        while (var2.hasNext()) {
            Product s = (Product) var2.next();
            System.out.println(s);
        }

        List<Person> newPerson = List.of(new Children("Анна", 2000.0, 5),
                new OldMan("Борис", 1000.0, 66),
                new Man("Женя", 1000.0, 35));
        System.out.println("Список покупателей : ");
        Iterator var9 = newPerson.iterator();

        Person d;
        while (var9.hasNext()) {
            d = (Person) var9.next();
            System.out.println(d);
        }

        var9 = newPerson.iterator();

        while (true) {
            while (var9.hasNext()) {
                d = (Person) var9.next();
                System.out.println("Покупает: " + d.getName());
                if (d.getCash() < 0.0) {
                    System.out.println("Отрицательное число денег");
                } else if (d.getCash() == 0.0) {
                    System.out.println("Нет денег");
                } else {
                    try {
                        for (int i = 0; i < 3; ++i) {
                            Product product = (Product) products.get((int) (Math.random() * (double) products.size()));
                            d.byuProduct(product);
                            System.out.println("Купил: " + product.getProductName());
                        }
                    } catch (Exception var7) {
                        System.out.println(var7.getMessage());
                    }
                }
            }

            return;
        }
    }
}