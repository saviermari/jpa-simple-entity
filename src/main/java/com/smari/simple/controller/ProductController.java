package com.smari.simple.controller;

import com.smari.simple.dto.ProductModel;
import com.smari.simple.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author smari
 */
@RestController
@RequestMapping(value = "/rest/v1", produces = { MediaType.APPLICATION_JSON_VALUE })
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/products")
    public ProductModel createProduct(@RequestBody ProductModel model){
        return service.createProduct(model);
    }

    @PutMapping("/products/{id}")
    public ProductModel updateProduct(@RequestBody ProductModel model, @PathVariable Long id){
        ProductModel product = service.getProduct(id);
        if(product == null){
            throw new RuntimeException("Not found");
        }
        if(model != null) if (null == model.getId()) {
            model.setId(product.getId());
        }
        return service.updateProduct(model);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
    }

    @GetMapping("/products/{id}")
    public ProductModel getProduct(@PathVariable Long id){
        return service.getProduct(id);
    }
    @GetMapping("/products")
    public List<ProductModel> getAllProducts(){
        return service.getAllProducts();
    }

}
