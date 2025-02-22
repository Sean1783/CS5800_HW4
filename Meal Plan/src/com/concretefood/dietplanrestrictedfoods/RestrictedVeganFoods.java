package com.concretefood.dietplanrestrictedfoods;

import com.concretefood.Food;

import java.util.HashSet;
import java.util.List;

public class RestrictedVeganFoods extends Food {

    public RestrictedVeganFoods(String name) {
        super(name);
    }

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of("Fish", "Chicken", "Tuna", "Beef", "Cheese", "Sour cream"));
    }
}
