package com.concretefood;

import java.util.HashSet;
import java.util.List;

public class Carb extends Food{
    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of("Cheese", "Lentils", "Bread", "Pistachio"));
    }
}
