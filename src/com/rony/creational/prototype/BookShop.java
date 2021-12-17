package com.rony.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
    private String shopName;
    private List<Book> bookList = new ArrayList<>();

    public BookShop() {
    }

    public BookShop(String shopName) {
        this.shopName = shopName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public void loadData(){
        for(int i=1; i<=10; i++){
            Book b = new Book();
            b.setBookId(i);
            b.setBookName("book-"+i);
            getBookList().add(b);
        }
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", bookList=" + bookList +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        for(Book book : getBookList()){
            bookShop.getBookList().add(book);
        }
        return bookShop;
    }
}
