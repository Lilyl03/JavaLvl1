package com.aca.exam.exam2;

public class Order {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", purchasedUser=" + purchasedUser.getId() +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public User getPurchasedUser() {
        return purchasedUser;
    }

    private int price;
    private User purchasedUser;

    public Order(int id, String name, int price, User purchasedUser) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.purchasedUser = purchasedUser;
    }
}
