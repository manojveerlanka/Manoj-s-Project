package com.manoj.helloworld.controller;

import com.manoj.helloworld.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class DemoController {
@GetMapping("/hello")
    public String greet() {
    return  "Hello World";
}

@GetMapping("/products")
public ArrayList<Product> getProducts(){
  ArrayList<Product> products = new ArrayList<>();
  Product p1 = new Product(1,"Notebook",5);
    Product p2 = new Product(2,"Pen",3);
    Product p3 = new Product(3,"Pencil",10);
products.add(p1);
    products.add(p2);
    products.add(p3);

    return products;

}



}
