package com.example.restapi.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.restapi.DAO.ProductRepository;
import com.example.restapi.Model.Product;

@Component
public class ProductService {

    @Autowired
    private ProductRepository PRODUCT_REPOSITORY;


    public List<Product> getALlProducts(){
        return  (List<Product>)this.PRODUCT_REPOSITORY.findAll();
    }
    
    public Product create(Product product){
       return this.PRODUCT_REPOSITORY.save(product);
    }

    public Product update(Product product, int id){
        Product current_product = this.PRODUCT_REPOSITORY.findById(id);

        if(current_product != null){
            current_product.setName(product.getName());
            current_product.setCategory(product.getCategory());
            current_product.setQuantity(product.getQuantity());
            current_product.setRegular_price(product.getRegular_price());
            current_product.setDiscount_price(product.getDiscount_price());

            this.PRODUCT_REPOSITORY.save(current_product);
        }
        return current_product;
    }

    public Product delete(int id){
        // Product product = this.PRODUCT_REPOSITORY.findById(id);
        return this.PRODUCT_REPOSITORY.deleteById(id);
    }
}
