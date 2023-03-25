package com.anu.codingQuestions.Cart.types;

import java.util.ArrayList;
import java.util.List;

import com.anu.codingQuestions.Cart.Custom.CartFullException;
import com.anu.codingQuestions.Cart.Custom.ItemNotFoundException;

public class Cart {
    private List<Item> items;
    private User user;

    public Cart(User user) {
        this.user = user;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) throws CartFullException {
        if (this.items.size() >= 20) {
            throw new CartFullException("Your cart is full");
        }
        this.items.add(item);
    }

    public void removeItem(Item item) throws ItemNotFoundException {
        if (!this.items.contains(item)) {
            throw new ItemNotFoundException("Item not found in cart");
        }
        this.items.remove(item);
    }

    public double getTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public List<Item> getItems() {
        return this.items;
    }
}
