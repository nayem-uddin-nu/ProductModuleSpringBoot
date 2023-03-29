package com.example.restapi.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.restapi.Model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer>{
    public Product findById(int id);
    public Product deleteById(int id);
}
