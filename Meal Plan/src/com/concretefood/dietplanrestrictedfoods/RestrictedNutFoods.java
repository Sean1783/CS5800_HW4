package com.concretefood.dietplanrestrictedfoods;

import com.concretefood.Food;

import java.util.HashSet;
import java.util.List;

public class RestrictedNutFoods extends Food {

    public RestrictedNutFoods(String name) {
        super(name);
    }

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of( "Pistachio", "Peanuts"));
    }
}
