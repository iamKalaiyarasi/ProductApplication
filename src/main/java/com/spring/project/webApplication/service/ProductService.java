package com.spring.project.webApplication.service;

import com.spring.project.webApplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> stringList = new ArrayList<>(Arrays.asList(
            new Product(1, "samsung", 10000),
            new Product(2, "nokia", 20000),
            new Product(3,"vivo", 30000)));

    public List<Product> productList(){
        return stringList;
    }

    public Product getProductById(int prodId) {

        return stringList.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }

    public void addProduct(Product product) {
        stringList.add(product);
    }
}
