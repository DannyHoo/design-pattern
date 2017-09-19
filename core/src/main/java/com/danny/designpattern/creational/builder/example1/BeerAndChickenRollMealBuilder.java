package com.danny.designpattern.creational.builder.example1;

/**
 * @author huyuyang@lxfintech.com
 * @Title: BeerAndChickenRollMealBuilder
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 14:18:28
 */
public class BeerAndChickenRollMealBuilder extends MealBuilder {

    public void buildFood() {
        meal.setFood("chicken roll");
    }

    public void buildDrink() {
        meal.setDrink("beer");
    }
}
