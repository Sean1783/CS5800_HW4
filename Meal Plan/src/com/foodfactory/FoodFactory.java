package com.foodfactory;

import com.concretefood.Carb;
import com.concretefood.Fat;
import com.concretefood.Food;
import com.concretefood.Protein;

public class FoodFactory {

    public Food getFood(String foodType) {
        return switch (foodType) {
            case "Carb" -> new Carb();
            case "Fat" -> new Fat();
            case "Protein" -> new Protein();
            default -> null;
        };
    }

}
