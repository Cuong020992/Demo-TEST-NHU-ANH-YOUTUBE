package com.codegym.demonhuanhyoutube.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Long idProduct;

    private String name;
    private int price;

    public Product() {
    }

    public Product(Long idProduct, String name, int price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }

    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
