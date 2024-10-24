package com.foodfactory;

import com.concretefood.*;

public class FoodFactory {

    public Food getFood(String foodType) {
        return switch (foodType) {
            case "Carb" -> new Carb();
            case "Fat" -> new Fat();
            case "Protein" -> new Protein();
            case "Paleo" -> new RestrictedPaleoFoods();
            case "Vegan" -> new RestrictedVeganFoods();
            case "Nut Allergy" -> new RestrictedNutFoods();
            default -> null;
        };
    }

}
