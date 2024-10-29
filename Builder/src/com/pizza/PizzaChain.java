package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaChain {
    public ArrayList<Pizza> pizzas;
    public String chainName;

    public PizzaChain(String chainName) {
        pizzas = new ArrayList<>();
        this.chainName = chainName;
    }

    public ArrayList<Pizza> getPizzas() {
        ArrayList<Pizza> pizzasList = new ArrayList<>();
        if (!pizzas.isEmpty()) {
            for (Pizza pizza : pizzas) {
                String size = pizza.getSize();
                List<String> toppings = pizza.getToppings();
                Pizza copiedPizza = new Pizza(size, toppings);
                copiedPizza.setChain(chainName);
                pizzasList.add(copiedPizza);
            }
        }
        return pizzasList;
    }

    public boolean addPizza(Pizza pizza) {
        if (pizzas.contains(pizza)) {
            return false;
        }
        pizza.setChain(chainName);
        pizzas.add(pizza);
        return true;
    }

    public boolean removePizza(Pizza pizza) {
        if (pizzas.contains(pizza)) {
            pizza.setChain(" - ");
            pizzas.remove(pizza);
            return true;
        }
        return false;
    }

    public void clearPizzaList() {
        if (!pizzas.isEmpty()) {
            for (Pizza pizza : pizzas) {
                pizza.setChain(" - ");
            }
            pizzas.clear();
        }
    }

    public void dump() {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.eat());
        }
    }

}
