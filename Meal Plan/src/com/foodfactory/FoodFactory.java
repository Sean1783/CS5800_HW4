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
            case "Carb" -> new Carb("Carb");
            case "Fat" -> new Fat("Fat");
            case "Protein" -> new Protein("Protein");
            case "Paleo" -> new RestrictedPaleoFoods("Paleo");
            case "Vegan" -> new RestrictedVeganFoods("Vegan");
            case "Nut Allergy" -> new RestrictedNutFoods("Nut Allergy");
            case "No restrictions" -> new RestrictedNoRestrictions("No restrictions");
            default -> null;
        };
    }

}
