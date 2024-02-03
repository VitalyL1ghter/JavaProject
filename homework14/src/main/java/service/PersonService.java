package service;

import model.Person;
import model.Product;

public interface PersonService {

    Person create (String name, double cash);

    Product byuRandomProduct(Product[] product, Person person);
}
