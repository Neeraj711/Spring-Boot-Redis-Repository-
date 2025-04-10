package com.example.RedisRepository.repository;

import com.example.RedisRepository.entity.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRedisRepository extends CrudRepository<Product, Long> {
}
