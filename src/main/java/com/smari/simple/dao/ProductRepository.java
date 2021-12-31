package com.smari.simple.dao;

import com.smari.simple.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author smari
 */
@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
}
