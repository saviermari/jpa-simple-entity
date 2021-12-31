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
    private String partNumber;

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

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }
}
