package com.anu.cart.user;

import com.anu.cart.cart.Cart;

public class User {
    
    private int id;
    private String name;
private Cart cart;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart=cart;
    }

    public int getId() {
        return id;
    }
    public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
