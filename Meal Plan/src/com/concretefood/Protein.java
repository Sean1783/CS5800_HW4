package com.concretefood;

import java.util.HashSet;
import java.util.List;

public class Protein extends Food {
    public Protein(String name) {
        super(name);
    }

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of("Fish", "Chicken", "Beef", "Tofu"));
    }
}
