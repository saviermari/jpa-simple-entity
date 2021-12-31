package com.smari.simple.service;

import com.smari.simple.dao.ProductRepository;
import com.smari.simple.dto.ProductModel;
import com.smari.simple.entity.Product;
import com.smari.simple.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author smari
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository repository;

    @Override
    public ProductModel createProduct(ProductModel model) {
        Product entity = repository.save(ProductMapper.convertModelToEntity(model));
        return ProductMapper.convertEntityToModel(entity);
    }

    @Override
    public ProductModel updateProduct(ProductModel model) {
        Product entity = repository.save(ProductMapper.convertModelToEntity(model));
        return ProductMapper.convertEntityToModel(entity);
    }

    @Override
    public void deleteProduct(Long id) {
        repository.deleteById(id);
    }

    @Override
    public ProductModel getProduct(Long id) {
        Optional<Product> entity = repository.findById(id);
        if(entity.isPresent()) {
            return ProductMapper.convertEntityToModel(entity.get());
        }
        return null;
    }

    @Override
    public List<ProductModel> getAllProducts() {
        List<Product> products = repository.findAll();
        List<ProductModel>  productModels = products.stream().map(ProductMapper::convertEntityToModel).collect(Collectors.toList());
        return productModels;
    }
}
