package com.usa.ciclo4.reto3_4a.repository.crudRepository;

import com.usa.ciclo4.reto3_4a.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
    public List<Product> findByPriceLessThanEqual(double price);
    public  List<Product> findByDescriptionContainingIgnoreCase(String description);
}
