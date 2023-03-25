package com.anu.cart.cart;

import java.util.ArrayList;
import java.util.List;

import com.anu.cart.item.Item;

public class CartController {
 
    private int userId;
    private  List<Item> cart = new ArrayList<>();
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void addItemToCart(int itemId) {
        // first find item in items db by its id
        CartDb.addItemToCart(userId, itemId);
    }

    public List<Item> cartItems(int cartId) {
        return CartDb.findItemsByCartId(cartId);
    }
    
    ////////////////////////////////////////
    public double calculateCartTotal() {
        double total = 0;
        for (Item item : cart) {
            total += item.getPrice();
        }
        return total;
}
   }
