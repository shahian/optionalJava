package com.shahian;

import java.util.Date;

public class Product {
    private Long id;
    private String name;
    private Date dateProduct;

    public Product() {
    }

    public Product(Long id, String name, Date dateProduct) {
        this.id = id;
        this.name = name;
        this.dateProduct = dateProduct;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDateProduct() {
        return dateProduct;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateProduct(Date dateProduct) {
        this.dateProduct = dateProduct;
    }

    @Override
    public String toString() {
        return getId()+ "," + getName() + "," + getDateProduct()   ;
    }
}

