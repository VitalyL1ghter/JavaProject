package service.impl;

import ExeptionValidate.ValidateData;
import model.Person;
import model.Product;
import service.PersonService;

public class PersonServiceImpl implements PersonService {

    public Person create(String name, double cash) {
        ValidateData.validCreatPerson(name);
        return new Person(name, cash);
    }

    public Product byuRandomProduct(Product[] products, Person person) {
        Product product = products[(int) (Math.random() * products.length)];
        ValidateData.validPersonCash(person);
        ValidateData.validCashCost(person, product);

        Product[] personProducts = person.getProducts();
        for (int i = 0; i < personProducts.length; i++) {
            if (personProducts[i] == null) {
                personProducts[i] = product;
                return product;
            }
        }
        return null;
    }
}
