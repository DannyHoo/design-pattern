package com.danny.designpattern.creational.builder.example1;

/**
 * @author huyuyang@lxfintech.com
 * @Title: Waiter
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 14:18:42
 */
public class Waiter {
    private MealBuilder mealBuilder;

    public Waiter(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }

    public Meal construct(){
        mealBuilder.buildFood();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }

}
