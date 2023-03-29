package com.example.restapi.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    int quantity;
    double regular_price;
    double discount_price;
    String name;
    String category;
}
