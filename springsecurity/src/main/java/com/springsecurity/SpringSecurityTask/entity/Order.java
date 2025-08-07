package com.springsecurity.SpringSecurityTask.entity;

public class Order 
{
	private String orderId;
    private String itemName;
    private int quantity;

    public Order() {}

    public Order(String orderId, String itemName, int quantity) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Getters and setters
    public String getOrderId() { 
    	return orderId; 
    	}
    public void setOrderId(String orderId) {
    	this.orderId = orderId;
    	}

    public String getItemName() {
    	return itemName; 
    	}
    public void setItemName(String itemName) { 
    	this.itemName = itemName;
    	}

    public int getQuantity() { 
    	return quantity; 
    	}
    public void setQuantity(int quantity) { 
    	this.quantity = quantity; 
    	}

}
