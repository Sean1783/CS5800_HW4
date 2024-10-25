package com.pizza;

import java.util.ArrayList;

public class PizzaChain {
    public ArrayList<Pizza> pizzas = new ArrayList<>();
    public String chainName;

    public PizzaChain(String chainName) {
        this.chainName = chainName;
    }

    public boolean addPizza(Pizza pizza) {
        if (!pizzas.contains(pizza)) {
            pizzas.add(pizza);
            pizza.setChain(chainName);
            return true;
        } else {
            return false;
        }
    }

    public boolean removePizza(Pizza pizza) {
        if (pizzas.contains(pizza)) {
            pizzas.remove(pizza);
            pizza.setChain(" - ");
            return true;
        }
        return false;
    }

    public void clearPizzaList() {
        for (Pizza pizza : pizzas) {
            pizza.setChain(" - ");
        }
        pizzas.clear();
    }

    public void dump() {
        for (Pizza pizza : pizzas) {
            pizza.eat();
        }
    }

}
