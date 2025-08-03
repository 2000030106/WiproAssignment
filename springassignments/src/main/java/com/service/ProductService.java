package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ProductDAO;
import com.pojo.Product;

@Service
public class ProductService 
{
	 private final  ProductDAO dao;

	 @Autowired
	    public ProductService(ProductDAO dao) {
	        this.dao = dao;
	    }

	    public Product getProductDetails(int code) {
	        return dao.getProductDetails(code);
	    }

	    public double calculatePrice(int qty, double price) {
	        return qty * price;
	    }

	    public boolean validateProductCode(int code) {
	        return code >= 1000 && code <= 9999;
	    }

	    public boolean validateQuantity(int qty) {
	        return qty > 0;
	    }

}
