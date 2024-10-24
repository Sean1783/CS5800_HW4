package com.concretefood;

import java.util.HashSet;
import java.util.List;

public class RestrictedPaleoFoods extends Food{

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of( "Cheese", "Bread", "Lentils", "Tofu", "Sour cream"));
    }
}
