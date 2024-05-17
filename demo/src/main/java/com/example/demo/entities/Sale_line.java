/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author cherifa
 */
@Entity
@Table(name = "sale_lines")
public class Sale_line {
    @Id
    @Column(name="sale_ligne_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
        
    @OneToMany
    private List<Product> products=new  ArrayList<>();
    
    @OneToMany
    private List<Sale> sales=new  ArrayList<>();
    
    @Column
    private int quantity;
    
    @Column
    private int amount;

    public Sale_line(List<Product> products, List<Sale> sales, int quantity, int amount) {
        this.products = products;
        this.sales = sales;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

 

    public int getQuantity() {
        return quantity;
    }

    public int getAmount() {
        return amount;
    }

  

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
