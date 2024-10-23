package com.pizza;

import java.util.HashSet;
import java.util.Set;

public class Pizza {
    private final Set<String> toppings = new HashSet<>();
    private final String size;

    private Pizza(String size, Set<String> toppings) {
        this.size = size;
        this.toppings.addAll(toppings);
    }

    public Set<String> getToppingsList() {
        return new HashSet<>(toppings);
    }

    public static class PizzaBuilder implements PizzaBuilderInterface {

        private final Set<String> toppings = new HashSet<>();
        private final String size;

        public PizzaBuilder(String size) {
            this.size = size;
        }

        public PizzaBuilder withTopping(String topping) {
            toppings.add(topping);
            return this;
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

    public String dump() {
        StringBuilder pizzaDetails = new StringBuilder();
        pizzaDetails.append(size + " - ");
        for (String topping : toppings) {
            pizzaDetails.append(topping).append(" ");
        }
        return pizzaDetails.toString();
    }
}
