package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer,Product> productMap;
    static {
        productMap = new HashMap<>();
        productMap.put(1,new Product(1,"ao","so mi",230000));
        productMap.put(2,new Product(2,"vay","cong so",200000));
        productMap.put(3,new Product(3,"quan","jean",250000));
        productMap.put(4,new Product(4,"ao","thun nam",270000));
        productMap.put(1,new Product(5,"ao","thun nu",290000));

    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getId(),product);


    }

    @Override
    public Product findById(int id) {
        return productMap.get(id);
    }

    @Override
    public void upDate(int id, Product product) {
        productMap.put(id,product);

    }

    @Override
    public void remove(int id) {
        productMap.remove(id);

    }
}
