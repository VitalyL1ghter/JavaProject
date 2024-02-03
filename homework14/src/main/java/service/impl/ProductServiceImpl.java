package service.impl;

import ExeptionValidate.ValidateData;
import model.Product;
import service.ProductService;

public class ProductServiceImpl implements ProductService {

    public Product create(String productName, double cost) {
        ValidateData.validCreatProduct(productName, cost);
        return new Product(productName, cost);
    }
}
