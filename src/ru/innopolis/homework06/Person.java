package ru.innopolis.homework06;

import java.util.Objects;
import java.util.StringJoiner;
public class Person {
    private String name;
    private double cash;
    private final Product[] products = new Product[10];
    public Person(String name, double cash) {
        this.name = name;
        this.cash = cash;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCash() {
        return cash;
    }
    public void setCash(double cash) {
        this.cash = cash;
    }
    public Product[] getProducts() {
        return products;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Double.compare(person.getCash(), getCash()) == 0 && Objects.equals(getName(), person.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCash());
    }
    @Override
    public String toString() {
        return new StringJoiner(", ", "", "")
                .add("Имя  '" + name + "'")
                .add("Деньги = " + cash)
                .toString();
    }
    public void byuProduct(Product product) {
        if (product.getCost() > cash) {
            throw new RuntimeException("Нехватает денег");
        }
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
    }
}
