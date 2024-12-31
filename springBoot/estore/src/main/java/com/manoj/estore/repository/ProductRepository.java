package com.manoj.estore.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.manoj.estore.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    // "Derived Query" to get Products by Title containing and ignore case
    List<Product> findByTitleContainingIgnoreCase(String title);

    // Derived Query to get Products by Brand and Category
    List<Product> findByBrandAndCategory(String brand, String category);

    // Custom Query using JPQL
    @Query("SELECT p FROM Product p WHERE p.brand = :brand AND p.price BETWEEN :minPrice AND :maxPrice ORDER BY p.price")
    List<Product> findProductsByBrandAndPriceRange(String brand, double minPrice, double maxPrice);

    List<Product> findByBrandAndPriceBetween(String brand, double minPrice, double maxPrice);
}