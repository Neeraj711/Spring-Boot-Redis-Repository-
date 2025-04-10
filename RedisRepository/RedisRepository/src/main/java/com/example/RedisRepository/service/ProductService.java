package com.example.RedisRepository.service;

import com.example.RedisRepository.entity.Product;
import com.example.RedisRepository.repository.ProductRedisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private ProductRedisRepository redisRepository;

    public Product saveProduct(Product product) {

        return redisRepository.save(product);
    }

    public Optional<Product> getProductById(Long id) {
        return redisRepository.findById(id);
    }

    public void deleteProduct(Long id) {
        redisRepository.deleteById(id);
    }


    public Iterable<Product> findAll() {
        return redisRepository.findAll();
    }

}

