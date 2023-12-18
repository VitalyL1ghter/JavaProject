package ru.innopolis.homework06;
public class App {
    public static void main(String[] args) {

        Product[] products = new Product[7];
        products[0] = new Product("Хлеб", 40);
        products[1] = new Product("Молоко", 60);
        products[2] = new Product("Торт", 1000);
        products[3] = new Product("Кофе растворимый", 879);
        products[4] = new Product("Масло", 150);
        products[5] = new Product("Мороженное", 200);
        products[6] = new Product("Макароны", 800);
        System.out.println("Список продуктов с ценами :");
        for (Product s : products) {
            System.out.println(s);
        }

        Person[] newPerson = new Person[5];
        int x;
        newPerson[0] = new Person("Павел Андреевич", 10000);
        newPerson[1] = new Person("Анна Петровна", 2000);
        newPerson[2] = new Person("Борис", 10);
        newPerson[3] = new Person("Женя", 0);
        newPerson[4] = new Person("Света", -3);
        System.out.println("Список покупателей : ");
        for (Person d : newPerson) {
            System.out.println(d);
        }

        for (Person d : newPerson) {
            System.out.println("Покупает: " + d.getName());
            if (d.getCash() < 0) {
                System.out.println("Отрицательное число денег");
                continue;
            }
            if (d.getCash() == 0) {
                System.out.println("Нет денег");
                continue;
            }
            try {
                for (int i = 0; i < 3; i++) {
                    Product product = products[(int) (Math.random() * products.length)];
                    d.byuProduct(product);
                    System.out.println("Купил: " + product.getProductName());
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}



