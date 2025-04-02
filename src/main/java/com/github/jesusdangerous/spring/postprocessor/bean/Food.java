package com.github.jesusdangerous.spring.postprocessor.bean;

import com.github.jesusdangerous.spring.postprocessor.annotation.Discount;

public class Food {

    private String type;
    private String dishName;

    @Discount(percent = 30)
    private int discount;

    public Food(String type, String dishName) {
        this.type = type;
        this.dishName = dishName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    @Override
    public String toString() {
        return "Food{" +
                "type='" + type + '\'' +
                ", dishName='" + dishName + '\'' +
                ", discount=" + discount +
                '}';
    }
}
