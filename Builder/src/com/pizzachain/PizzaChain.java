package com.pizzachain;

import com.pizza.Pizza;

import java.util.ArrayList;

public class PizzaChain implements PizzaChainInterface{
    public ArrayList<Pizza> pizzas = new ArrayList<>();
    public String chainName;

    @Override
    public void eat() {
        System.out.println(chainName);
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.dump());
        }
    }


}
