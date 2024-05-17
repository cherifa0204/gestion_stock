/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author cherifa
 */
@Controller
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    
    // @GetMapping("/create")
    // public String create(Model model){
      
      
    
    // }
    
    @GetMapping("/products")
    public String index(Model model){
      Product p1 =new Product("rice", 100, 1200,1200);
      productRepository.save(p1);

      List<Product> products = new ArrayList<>();
      productRepository.findAll().forEach(product -> products.add(product));
      
      for (Product product : products) {
             System.out.println("product: " + product.getName());
      }
     
      return "products/index";
   
    
    }
    
    
}
