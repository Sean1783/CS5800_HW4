package com.concretefood;

import java.util.HashSet;
import java.util.List;

public class Protein extends Food {
    @Override
    public HashSet<String> getFoodOptionsList() {
        return new HashSet<>(List.of("Fish", "Chicken", "Beef", "Tofu"));
    }
}
