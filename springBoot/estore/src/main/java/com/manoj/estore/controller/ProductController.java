package com.manoj.estore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.manoj.estore.model.Product;
import com.manoj.estore.service.ProductService;

import java.util.ArrayList;
import java.util.List;

// Separation of Concerns
// Dependency
// Dependency Injection -> Spring Framework creates your dependency objects and injects
// IOC - Inversion of Control -> Giving control of object creation to Spring framework

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Get all Products
    @GetMapping
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    //     Get Product by ID
    @GetMapping("/{id}")
//    public Product getProductById(@PathVariable Long id) {
//        return productService.getProductById(id);
//    }

    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        if(product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }


    /**
     * Retrieves a list of products filtered by the specified title.
     *
     * @param title the title of the products to be retrieved
     * @return a list of products that match the specified title
     */
    @GetMapping("/search")
    public List<Product> getProductsByTitle(@RequestParam String title) {
        return productService.getProductsByTitle(title);
    }

    /**
     * Retrieves a list of products filtered by the specified brand and category.
     *
     * @param brand the brand of the products to be retrieved
     * @param category the category of the products to be retrieved
     * @return a list of products that match the specified brand and category
     */
    @GetMapping("/brand-category")
    public List<Product> getProductsByBrandAndCategory(@RequestParam String brand, @RequestParam String category) {
        return productService.getProductsByBrandAndCategory(brand, category);
    }


    /**
     * Retrieves a list of products filtered by brand and price range.
     *
     * @param brand   the brand of the products to be retrieved
     * @param minPrice the minimum price of the products to be retrieved
     * @param maxPrice the maximum price of the products to be retrieved
     * @return a list of products that match the specified brand and fall within the specified price range
     */
    @GetMapping("/brand-price")
    public List<Product> getProductsByBrandAndPriceRange(@RequestParam String brand,@RequestParam double minPrice, @RequestParam double maxPrice) {
        return productService.getProductsByBrandAndPriceRange(brand, minPrice, maxPrice);
    }


    /* Create, Update and Delete Functions */
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        Product prod = productService.createProduct(product);
        return prod;
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return productService.updateProduct(id, productDetails);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        boolean isDeleted = productService.deleteProduct(id);
        if (isDeleted) {
            return new ResponseEntity<>(null, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    }





//    @PostMapping
//    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
//        Product createdProduct = productService.createProduct(product);
//        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
//    }
}
