package com.cindy;

public class Customer {
    String id;
    int sellingprice;
    String discount;
    int discountprice;

    public Customer(String id, int sellingprice, String discount, int discountprice) {
        this.id = id;
        this.sellingprice = sellingprice;
        this.discount = discount;
        this.discountprice = discountprice;
    }

    public void print() {
        System.out.println(id + "\t" + sellingprice + "\t" + discount + "\t" + discountprice);
    }
}
