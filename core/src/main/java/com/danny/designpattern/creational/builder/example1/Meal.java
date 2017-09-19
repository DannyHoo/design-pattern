package com.danny.designpattern.creational.builder.example1;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Meal
 * @Copyright: Copyright (c) 2016
 * @Description: 创建的套餐
 * @Company: lxjr.com
 * @Created on 2017-09-18 14:16:47
 */
public class Meal {
    private String food; //主食
    private String drink; //饮品

    public String getFood() {
        return food;
    }

    public Meal setFood(String food) {
        this.food = food;
        return this;
    }

    public String getDrink() {
        return drink;
    }

    public Meal setDrink(String drink) {
        this.drink = drink;
        return this;
    }
}
