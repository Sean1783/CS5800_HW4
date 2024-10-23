package com.pizza;

import com.pizza.Pizza.PizzaBuilder;

public interface PizzaBuilderInterface {
    public PizzaBuilder withTopping(String topping);
    public PizzaBuilder withPepperoni();
    public PizzaBuilder withSausage();
    public PizzaBuilder withMushrooms();
    public PizzaBuilder withBacon();
    public PizzaBuilder withOnions();
    public PizzaBuilder withExtraCheese();
    public PizzaBuilder withPeppers();
    public PizzaBuilder withChicken();
    public PizzaBuilder withOlives();
    public PizzaBuilder withSpinach();
    public PizzaBuilder withTomatoAndBasil();
    public PizzaBuilder withBeef();
    public PizzaBuilder withHam();
    public PizzaBuilder withPesto();
    public PizzaBuilder withSpicyPork();
    public PizzaBuilder withHamAndPineapple();

    public Pizza build();

}
