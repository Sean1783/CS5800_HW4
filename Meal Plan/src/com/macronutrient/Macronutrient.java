package com.macronutrient;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

public class Macronutrient {

    private static Macronutrient macronutrient = null;
    private final ArrayList<String> foodCategories = new ArrayList<>(Arrays.asList(
            "Carb", "Protein", "Fat"));
    private final ArrayList<String> dietPlans=  new ArrayList<>(Arrays.asList(
            "Paleo", "Vegan", "Nut Allergy", "No restrictions"));

    private Macronutrient() {}

    public static Macronutrient getInstance() {
        if (macronutrient == null) {
            macronutrient = new Macronutrient();
        }
        return macronutrient;
    }

    public ArrayList<String> getFoodCategories() {
        return new ArrayList<>(foodCategories);
    }

    public ArrayList<String> getDietPlans() {
        return new ArrayList<>(dietPlans);
    }

    public HashMap<String, HashMap<String, String>> createMeal(String dietPlanName) {
        if (!dietPlans.contains(dietPlanName)) {
            throw new IllegalArgumentException("Unknown diet plan name: " + dietPlanName);
        }

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

    public ArrayList<String> removeRestrictedFoods(HashSet<String> fullFoodList, HashSet<String> restrictedFoods) {
        ArrayList<String> approvedFoodsList = new ArrayList<>(fullFoodList);
        approvedFoodsList.removeAll(restrictedFoods);
        return approvedFoodsList;
    }

    public String selectRandomItem(ArrayList<String> approvedFoodsList) {
        Random random = new Random();
        int randomIndex = random.nextInt(approvedFoodsList.size());
        return approvedFoodsList.get(randomIndex);
    }

}
