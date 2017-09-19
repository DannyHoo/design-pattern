package com.danny.designpattern.creational.builder.example1;

/**
 * @author huyuyang@lxfintech.com
 * @Title: CocacolaAndHamburgerMealBuilder
 * @Copyright: Copyright (c) 2016
 * @Description:
 * @Company: lxjr.com
 * @Created on 2017-09-18 14:18:02
 */
public class CocacolaAndHamburgerMealBuilder extends MealBuilder{

    public void buildFood() {
        meal.setFood("hamburger");
    }

    public void buildDrink() {
        meal.setDrink("coca cola");
    }
}
