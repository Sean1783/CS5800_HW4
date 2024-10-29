package com.concretefood.dietplanrestrictedfoods;

import com.concretefood.Food;

import java.util.HashSet;
import java.util.List;

public class RestrictedPaleoFoods extends Food {

    public RestrictedPaleoFoods(String name) {
        super(name);
    }

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of( "Cheese", "Bread", "Lentils", "Tofu", "Sour cream"));
    }
}
