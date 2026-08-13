package org.skypro;

import org.skypro.skyshop.Product;
import org.skypro.sryshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product apple = new Product("Яблоко", 50);
        Product bread = new Product("Хлеб", 30);
        Product milk = new Product("Молоко", 80);
        Product cheese = new Product("Сыр", 120);
        Product meat = new Product("Мясо", 300);
        Product juice = new Product("Сок", 70);

        ProductBasket basket = new ProductBasket();

        basket.addProduct(apple);
        basket.addProduct(bread);
        basket.addProduct(milk);
        basket.addProduct(cheese);
        basket.addProduct(meat);

        basket.addProduct(juice);

        System.out.println("Содержимое корзины:");
        basket.printContents();
        System.out.println("Общая стоимость:" + basket.getTotalPrice());
        System.out.println("Есть ли 'молоко'?" + basket.containsProduct("Молоко"));
        System.out.println("Есть ли 'сок'?" + basket.containsProduct("Сок"));

        basket.clear();

        System.out.println("После отчистки");
        basket.printContents();

        System.out.println("Стоимость пустой корзины: " + basket.getTotalPrice());
        System.out.println("Есть ли 'яблоко'?" + basket.containsProduct("Яблоко"));
    }
}

