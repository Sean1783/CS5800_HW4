package com.concretefood;

import java.util.HashSet;
import java.util.List;

public class Fat extends Food{
    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of("Avocado", "Sour cream", "Tuna", "Peanuts"));
    }
}
