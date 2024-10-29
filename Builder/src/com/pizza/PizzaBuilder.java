package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder implements PizzaBuilderInterface {

    private final List<String> toppings;
    private final String size;

    public PizzaBuilder(String size) {
        if (size == null || !(size.equals("Small") || size.equals("Medium") || size.equals("Large"))) {
            throw new IllegalArgumentException("Size must be 'Small', 'Medium', or 'Large'");
        }
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return new ArrayList<>(toppings);
    }

    @Override
    public PizzaBuilder withPepperoni() {
        toppings.add("Pepperoni");
        return this;
    }

    @Override
    public PizzaBuilder withSausage() {
        toppings.add("Sausage");
        return this;
    }

    @Override
    public PizzaBuilder withMushrooms() {
        toppings.add("Mushrooms");
        return this;
    }

    @Override
    public PizzaBuilder withBacon() {
        toppings.add("Bacon");
        return this;
    }

    @Override
    public PizzaBuilder withOnions() {
        toppings.add("Onions");
        return this;
    }

    @Override
    public PizzaBuilder withExtraCheese() {
        toppings.add("Extra Cheese");
        return this;
    }

    @Override
    public PizzaBuilder withPeppers() {
        toppings.add("Peppers");
        return this;
    }

    @Override
    public PizzaBuilder withChicken() {
        toppings.add("Chicken");
        return this;
    }

    @Override
    public PizzaBuilder withOlives() {
        toppings.add("Olives");
        return this;
    }

    @Override
    public PizzaBuilder withSpinach() {
        toppings.add("Spinach");
        return this;
    }

    @Override
    public PizzaBuilder withTomatoAndBasil() {
        toppings.add("Tomato and Basil");
        return this;
    }

    @Override
    public PizzaBuilder withBeef() {
        toppings.add("Beef");
        return this;
    }

    @Override
    public PizzaBuilder withHam() {
        toppings.add("Ham");
        return this;
    }

    @Override
    public PizzaBuilder withPesto() {
        toppings.add("Pesto");
        return this;
    }

    @Override
    public PizzaBuilder withSpicyPork() {
        toppings.add("Spicy Pork");
        return this;
    }

    @Override
    public PizzaBuilder withHamAndPineapple() {
        toppings.add("Ham and Pineapple");
        return this;
    }

    @Override
    public Pizza build() {
        return new Pizza(this.size, this.toppings);
    }
}


