package com.macronutrient;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;

import java.util.*;

public class Macronutrient {

    private final ArrayList<String> foodCategories = new ArrayList<String>(Arrays.asList(
            "Carb", "Protein", "Fat"));
    private static Macronutrient macronutrient = null;

    private Macronutrient(){}

    public static Macronutrient getInstance() {
        if (macronutrient == null) {
            macronutrient = new Macronutrient();
        }
        return macronutrient;
    }

    // Input validation needed.
    public HashMap<String, HashMap<String, String>> createMeal(String dietPlanName) {
        HashMap<String, HashMap<String, String>> mealPlan = new HashMap<>();
        mealPlan.put(dietPlanName, new HashMap<>());
        FoodFactory foodFactory = FoodFactory.getInstance();
        Food restrictedFoods = foodFactory.getFood(dietPlanName);
        HashSet<String> restrictedFoodList = restrictedFoods.getFoodList();

        for (String category : foodCategories) {
            Food foodType = foodFactory.getFood(category);
            HashSet<String> fullFoodList = foodType.getFoodList();
            ArrayList<String> approvedFoodList = removeRestrictedFoods(fullFoodList, restrictedFoodList);
            String foodSelection = selectRandomItem(approvedFoodList);
            mealPlan.get(dietPlanName).put(category, foodSelection);
        }
        return mealPlan;
    }

    private ArrayList<String> removeRestrictedFoods(HashSet<String> fullFoodList, HashSet<String> restrictedFoods) {
        ArrayList<String> approvedFoodsList = new ArrayList<>(fullFoodList);
        approvedFoodsList.removeAll(restrictedFoods);
        return approvedFoodsList;
    }

    private String selectRandomItem(ArrayList<String> approvedFoodsList) {
        Random random = new Random();
        int randomIndex = random.nextInt(approvedFoodsList.size());
        return approvedFoodsList.get(randomIndex);
    }

}
