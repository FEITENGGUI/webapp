package com.example.demo.entity;

public class Fruit {
    private int price;
    private String color;

    public int getPrice() {
        return price;
    }

    public Fruit setPrice(int price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Fruit setColor(String color) {
        this.color = color;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");
        sb.append("price=").append(price);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
