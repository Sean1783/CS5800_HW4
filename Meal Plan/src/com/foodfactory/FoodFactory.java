package com.foodfactory;

import com.concretefood.*;
import com.concretefood.dietplanrestrictedfoods.*;

public class FoodFactory {

    private static FoodFactory foodFactory = null;

    private FoodFactory() {}

    public static FoodFactory getInstance() {
        if (foodFactory == null) {
            foodFactory = new FoodFactory();
        }
        return foodFactory;
    }

    public Food getFood(String foodType) {
        return switch (foodType) {
            case "Carb" -> new Carb();
            case "Fat" -> new Fat();
            case "Protein" -> new Protein();
            case "Paleo" -> new RestrictedPaleoFoods();
            case "Vegan" -> new RestrictedVeganFoods();
            case "Nut Allergy" -> new RestrictedNutFoods();
            case "No restrictions" -> new RestrictedNoRestrictions();
            default -> null;
        };
    }

}
