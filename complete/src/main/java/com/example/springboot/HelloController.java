package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final JsonDataService jsonDataService;

    public ProductController(JsonDataService jsonDataService) {
        this.jsonDataService = jsonDataService;
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return jsonDataService.getAllProducts();
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        List<Product> products = jsonDataService.getAllProducts();
        // Add the new product to the list and save it back to the JSON file.
        products.add(product);
        jsonDataService.saveProducts(products);
        return product;
    }

    // Implement other CRUD operations for products here

}

