package com.rony.creational.prototype;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop shop = new BookShop();
        shop.setShopName("Shop one");
        shop.loadData();

        BookShop shop2 = (BookShop) shop.clone();
        shop.getBookList().remove(2);
        shop2.setShopName("Shop 2");


        System.out.println(shop);
        System.out.println(shop2);
    }
}
