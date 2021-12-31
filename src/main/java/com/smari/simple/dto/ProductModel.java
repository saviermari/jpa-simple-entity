package com.smari.simple.dto;

import java.io.Serializable;

/**
 * @author smari
 * Data Transfer object for the product entity
 */
public class ProductModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
