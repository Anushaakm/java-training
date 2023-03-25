package com.anu.codingQuestions.Cart.boot;

import java.util.List;
import java.util.Scanner;

import com.anu.codingQuestions.Cart.Custom.CartFullException;
import com.anu.codingQuestions.Cart.Custom.ItemNotFoundException;
import com.anu.codingQuestions.Cart.types.Cart;
import com.anu.codingQuestions.Cart.types.Item;
import com.anu.codingQuestions.Cart.types.User;

public class ShoppingCartRunner {
    public static void main(String[] args) {
        User user = new User("John");
        Cart cart = new Cart(user);

        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("Welcome to the shopping cart program!");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart and total");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid choice, please enter a number from 1 to 4");
                scanner.nextLine(); // clear input buffer
                continue;
            }

            while (choice != 4) {
                System.out.println("Welcome to the shopping cart program!");
                System.out.println("1. Add item to cart");
                System.out.println("2. Remove item from cart");
                System.out.println("3. View cart and total");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                try {
                    choice = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid choice, please enter a number from 1 to 4");
                    scanner.nextLine(); // clear input buffer
                    continue;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter item name: ");
                        String itemName = scanner.next();
                        System.out.print("Enter item price: ");
                        double itemPrice = 0.0;

                        try {
                            itemPrice = scanner.nextDouble();
                        } catch (Exception e) {
                            System.out.println("Invalid price, please enter a number");
                            scanner.nextLine(); // clear input buffer
                            continue;
                        }

                        Item item = new Item(itemName, itemPrice);

                        try {
                            cart.addItem(item);
                            System.out.println("Item added to cart");
                        } catch (CartFullException e) {
                            System.out.println(e.getMessage());
                        }

                        break;

                    case 2:
                        System.out.print("Enter item name: ");
                        String removeItemName = scanner.next();
                        Item removeItem = null;

                        for (Item i : cart.getItems()) {
                            if (i.getName().equals(removeItemName)) {
                                removeItem = i;
                                break;
                            }
                        }

                        if (removeItem == null) {
                            System.out.println("Item not found in cart");
                        } else {
                            try {
                                cart.removeItem(removeItem);
                                System.out.println("Item removed from cart");
                            } catch (ItemNotFoundException e) {
                                System.out.println(e.getMessage());
                            }
                        }

                        break;

                    case 3:
                        List<Item> items = cart.getItems();

                        if (items.isEmpty()) {
                            System.out.println("Your cart is empty");
                        } else {
                            System.out.println("Your cart:");

                            for (Item i : items) {
                                System.out.println(i.getName() + " - $" + i.getPrice());
                            }

                            System.out.println("Total: $" + cart.getTotal());
                        }

                        break;

                    case 4:
                        System.out.println("Thank you for shopping with us!");
                        break;

                    default:
                        System.out.println("Invalid choice, please enter a number from 1 to 4");
                        break;
                }
            }
}}}