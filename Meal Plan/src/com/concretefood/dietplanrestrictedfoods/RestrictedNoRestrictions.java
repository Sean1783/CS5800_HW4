package com.concretefood.dietplanrestrictedfoods;

import com.concretefood.Food;

import java.util.HashSet;
import java.util.List;

public class RestrictedNoRestrictions extends Food {

    public RestrictedNoRestrictions(String name) {
        super(name);
    }

    @Override
    public HashSet<String> getFoodList() {
        return new HashSet<>(List.of( ""));
    }
}
