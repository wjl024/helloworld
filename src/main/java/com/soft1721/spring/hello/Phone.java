package com.soft1721.spring.hello;

public class Phone {
    private  String grand;
    private double price;
    private double size;

    public Phone(String grand, double price, double size) {
        this.grand = grand;
        this.price = price;
        this.size = size;
    }

    public Phone() {
    }

    public String getGrand() {
        return grand;
    }

    public void setGrand(String grand) {
        this.grand = grand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "grand='" + grand + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
