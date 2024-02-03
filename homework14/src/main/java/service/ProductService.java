package service;

import model.Product;

public interface ProductService {

    Product create(String productName, double cost);
}
