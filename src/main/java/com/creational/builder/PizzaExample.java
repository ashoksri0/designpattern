package com.creational.builder;

import com.creational.Pizza;

public class PizzaExample {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder().
                setDough("cross")
                .setSauce("mild")
                .setTopping("pepperoni,salami")
                .setType(Pizza.PIZZA_TYPE.VEG)
                .build();
        System.out.println(pizza);
    }
}
