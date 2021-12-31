package com.smari.simple.mapper;

import com.smari.simple.dto.ProductModel;
import com.smari.simple.entity.Product;

/**
 * @author smari
 */
public class ProductMapper {
    public static Product convertModelToEntity(ProductModel model){
        Product entity = new Product();
        if(model != null){
            if(null != model.getId()) {
                entity.setId(model.getId());
            }
            entity.setName(model.getName());
        }
        return entity;
    }

    public static ProductModel convertEntityToModel(Product entity){
        ProductModel model = new ProductModel();
        if(entity != null){
            if(null != entity.getId()) {
                model.setId(entity.getId());
            }
            model.setName(entity.getName());
        }
        return model;
    }


}
