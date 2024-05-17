/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author cherifa
 */
@Entity
@Table(name = "sales")
public class Sale {
    @Id
    @Column(name = "sale_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     
    //montanttotal
    @Column
    private int total_amount;
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date sale_date;

    public Sale(int total_amount, Date sale_date) {
        this.total_amount = total_amount;
        this.sale_date = sale_date;
    }

    public Long getId() {
        return id;
    }

    public int getTotal_amount() {
        return total_amount;
    }

    public Date getSale_date() {
        return sale_date;
    }

    public void setTotal_amount(int total_amount) {
        this.total_amount = total_amount;
    }

    public void setSale_date(Date sale_date) {
        this.sale_date = sale_date;
    }
    
    @Override
    public String toString() {
        return this.id +" "+ this.total_amount; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
