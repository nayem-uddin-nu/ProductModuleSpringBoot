package com.example.restapi.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.example.restapi.Model.Product;
import com.example.restapi.Service.ProductService;

@RestController
public class ProductController {

    @Autowired
    private ProductService PRODUCT_SERVICE;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return this.PRODUCT_SERVICE.getALlProducts();
    }

    @PostMapping("/products/create-new-product")
    public Product create(@RequestBody Product product){
        this.PRODUCT_SERVICE.create(product);
        return product;
    }

    @PutMapping("/products/update-product/{id}")
    public Product update(@RequestBody Product product, @PathVariable("id") int id){
        Product updated_product = this.PRODUCT_SERVICE.update(product, id);
        return updated_product;
    }

    @GetMapping("/products/delete-product/{id}")
    public Product delete(@PathVariable("id") int id){
        return this.PRODUCT_SERVICE.delete(id);
    }

    @PostMapping("/products/update-product/{id}")
    public Product update_Product(@RequestBody Product product, @PathVariable("id") int id){
        Product updated_product = this.PRODUCT_SERVICE.update(product, id);
        return updated_product;
    }
}
