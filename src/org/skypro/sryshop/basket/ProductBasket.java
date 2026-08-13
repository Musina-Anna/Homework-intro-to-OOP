package org.skypro.sryshop.basket;

import org.skypro.skyshop.Product;

public class ProductBasket {
    private final Product[] products = new Product[5];

    public void addProduct(Product product) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
                products[i] = product;
                return;
            }
        }
        System.out.println("Невозможно добавить продукт");
    }

    public int getTotalPrice() {
        int total = 0;
        for (Product p : products) {
            if (p != null) {
                total += p.getPrice();
            }
        }
        return total;
    }

    public void printContents() {
        boolean empty = true;
        for (Product p : products) {
            if (p != null) {
                System.out.println(p.getName() + ":" + p.getPrice());
                empty = false;
            }
        }
        if (empty) {
            System.out.println("В корзине пусто.");
        } else {
            System.out.println("Итого " + getTotalPrice());
        }
    }

    public boolean containsProduct(String name) {
        for (Product p : products) {
            if (p != null && p.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void clear() {
        for (int i = 0; i < products.length; i++) {
            products[i] = null;
        }
    }
}
