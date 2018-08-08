package com.creational.builder;

import com.creational.Pizza;

public class PizzaExample {
    public static void main(String[] args) {
       // Pizza pizzaBefore=new Pizza("cross","mild","pepperoni,salami",Pizza.PIZZA_TYPE.VEG);
        
        
        //this is with deign pattern
        Pizza pizzaAfter = new Pizza.PizzaBuilder().
                setDough("cross")
                .setSauce("mild")
                .setTopping("pepperoni,salami")
                .setType(Pizza.PIZZA_TYPE.VEG)
                .build();
        System.out.println(pizzaAfter);
    }
}
