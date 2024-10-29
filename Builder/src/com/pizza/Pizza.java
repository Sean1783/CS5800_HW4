package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final List<String> toppings;
    private final String size;
    private String chain;

    Pizza(String size, List<String> toppings) {
        this.size = size;
        this.toppings = new ArrayList<>(toppings);
        this.chain = " - ";
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    public String getSize() {
        return size;
    }

    public String getChain() {
        return this.chain;
    }

    void setChain(String chain) {
        this.chain = chain;
    }

    public String eat() {
        StringBuilder pizzaDetails = new StringBuilder();
        pizzaDetails.append(chain + " - " + size + " - ");
        for (String topping : toppings) {
            pizzaDetails.append(topping).append(" ");
        }
        return pizzaDetails.toString();
    }
}
