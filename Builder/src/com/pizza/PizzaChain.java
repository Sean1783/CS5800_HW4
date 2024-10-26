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
        if (pizzas == null) {
            return null;
        }
        ArrayList<Pizza> pizzasList = new ArrayList<>();
        for (Pizza pizza : pizzas) {
            String size = pizza.getSize();
            List<String> toppings = pizza.getToppings();
            Pizza copiedPizza = new Pizza(size, toppings);
            copiedPizza.setChain(chainName);
            pizzasList.add(copiedPizza);
        }
        return pizzasList;
    }

    public boolean addPizza(Pizza pizza) {
        if (pizzas == null) {
            pizzas = new ArrayList<>();
        }
        else if (pizzas.contains(pizza)) {
            return false;
        }
        pizza.setChain(chainName);
        pizzas.add(pizza);
        return true;
    }

    public boolean removePizza(Pizza pizza) {
        if (pizzas == null) {
            return false;
        }
        else if (pizzas.contains(pizza)) {
            pizza.setChain(" - ");
            pizzas.remove(pizza);
            if (pizzas.isEmpty()) {
                pizzas = null;
            }
            return true;
        }
        return false;
    }

    public void clearPizzaList() {
        if (pizzas != null) {
            for (Pizza pizza : pizzas) {
                pizza.setChain(" - ");
            }
            pizzas.clear();
            pizzas = null;
        }
    }

    public void dump() {
        for (Pizza pizza : pizzas) {
            pizza.eat();
        }
    }

}
