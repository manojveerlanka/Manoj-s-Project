package com.manoj.estore.service;

import com.manoj.estore.model.Product;
import com.manoj.estore.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.productRepository = repository;
    }





    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        Product dummyProduct = new Product();
        dummyProduct.setId(0L);
        dummyProduct.setTitle("Unknown Product");
        dummyProduct.setPrice(0);
        return productRepository.findById(id).orElse(null);
    }




    public List<Product> getProductsByBrandAndPriceRange(String brand, double minPrice, double maxPrice) {
//        return productRepository.findProductsByBrandAndPriceRange(brand, minPrice, maxPrice);
        return productRepository.findByBrandAndPriceBetween(brand, minPrice, maxPrice);
    }


    public List<Product> getProductsByTitle(String title) {
        return productRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Product> getProductsByBrandAndCategory(String brand, String category) {
        return productRepository.findByBrandAndCategory(brand, category);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product productDetails) {
        Product product = productRepository.findById(id).orElseThrow();
        String newTitle = productDetails.getTitle();
        double newPrice = productDetails.getPrice();
        product.setTitle(newTitle);
        product.setPrice(newPrice);
        return productRepository.save(product);
    }

    public boolean deleteProduct(Long id) {
        if(productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

}