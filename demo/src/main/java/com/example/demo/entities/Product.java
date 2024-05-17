/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author cherifa
 */
@Entity
@Table(name = "products")
public class Product {
    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name="product_name",unique = true,length = 255)
    private String name;
    
    @Column
    private int stock_quantity;
    //prix d'achat
    @Column
    private int purchase_price;
    //prix de vente
    @Column
    private int sale_price;

    public Product(String name, int stock_quantity, int purchase_price, int sale_price) {
        this.name = name;
        this.stock_quantity = stock_quantity;
        this.purchase_price = purchase_price;
        this.sale_price = sale_price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStock_quantity() {
        return stock_quantity;
    }

    public int getPurchase_price() {
        return purchase_price;
    }

    public int getSale_price() {
        return sale_price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock_quantity(int stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public void setPurchase_price(int purchase_price) {
        this.purchase_price = purchase_price;
    }

    public void setSale_price(int sale_price) {
        this.sale_price = sale_price;
    }
   
    
    
    
    
    @Override
    public String toString() {
        return "product: "+this.id + " "+ this.name; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
