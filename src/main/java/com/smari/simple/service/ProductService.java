package com.smari.simple.service;

import com.smari.simple.dto.ProductModel;

import java.util.List;

/**
 * @author smari
 */
public interface ProductService {
    public ProductModel createProduct(ProductModel model);
    public ProductModel updateProduct(ProductModel model);
    public void deleteProduct(Long id);
    public ProductModel getProduct(Long id);
    public List<ProductModel> getAllProducts();
}
