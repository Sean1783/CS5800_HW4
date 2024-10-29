package com.concretefood;

import java.util.HashSet;

public abstract class Food {
    public String name;
    public Food(String name) {
        this.name = name;
    }
    public abstract HashSet<String> getFoodList();
}
