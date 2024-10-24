package com.dietplan;

import com.concretefood.Food;
import com.foodfactory.FoodFactory;

import java.util.*;

public class DietPlan {

    private FoodFactory foodFactory;
    public DietPlan() {
        foodFactory = new FoodFactory();
    }

    public HashMap<String, HashMap<String, String>> createDietPlan(String dietPlan) {
        HashMap<String, HashMap<String, String>> mealPlan = new HashMap<>();
        switch (dietPlan) {
            case "Paleo":
                return makePaleoDietPlan();
            case "Vegan":
                return makeVeganDietPlan();
            default:
                return mealPlan;

        }
    }

    private HashMap<String, HashMap<String, String>> makePaleoDietPlan() {
        HashMap<String, HashMap<String, String>> mealPlan = new HashMap<>();
        mealPlan.put("Paleo", new HashMap<>());

        HashSet<String> carbList = makePaleoCarbSet();
        String randomCarb = selectRandomItem(carbList);
        mealPlan.get("Paleo").put("Carb", randomCarb);

        HashSet<String> proteinList =  makePaleoProteinSet();
        String randomProtein = selectRandomItem(proteinList);
        mealPlan.get("Paleo").put("Protein", randomProtein);

        HashSet<String> fatList = makePaleoFatSet();
        String randomFat = selectRandomItem(fatList);
        mealPlan.get("Paleo").put("Fat", randomFat);
        return mealPlan;
    }

    private HashMap<String, HashMap<String, String>> makeVeganDietPlan() {
        HashMap<String, HashMap<String, String>> mealPlan = new HashMap<>();
        mealPlan.put("Vegan", new HashMap<>());

        HashSet<String> carbList = makeVeganCarbSet();
        String randomCarb = selectRandomItem(carbList);
        mealPlan.get("Vegan").put("Carb", randomCarb);

        HashSet<String> proteinList =  makeVeganProteinSet();
        String randomProtein = selectRandomItem(proteinList);
        mealPlan.get("Vegan").put("Protein", randomProtein);

        HashSet<String> fatList = makeVeganFatSet();
        String randomFat = selectRandomItem(fatList);
        mealPlan.get("Vegan").put("Fat", randomFat);
        return mealPlan;
    }

    private HashSet<String> makePaleoCarbSet() {
        Food carb = foodFactory.getFood("Carb");
        HashSet<String> carbList = carb.getFoodOptionsList();
        carbList.remove("Cheese");
        carbList.remove("Bread");
        carbList.remove("Lentils");
        return carbList;
    }

    private ArrayList<String> removeRestrictedFoods(HashSet<String> fullFoodList, ArrayList<String> restrictedFoods) {
        ArrayList<String> approvedFoodsList = new ArrayList<>();
        for (String food : fullFoodList) {
            if (!restrictedFoods.contains(food)) {
                approvedFoodsList.add(food);
            }
        }
        return approvedFoodsList;
    }

    private HashSet<String> makePaleoProteinSet() {
        Food protein = foodFactory.getFood("Protein");
        HashSet<String> proteinList = protein.getFoodOptionsList();
        proteinList.remove("Tofu");
        return proteinList;
    }

    private HashSet<String> makePaleoFatSet() {
        Food fat = foodFactory.getFood("Fat");
        HashSet<String> fatList = fat.getFoodOptionsList();
        fatList.remove("Sour cream");
        return fatList;
    }

    private HashSet<String> makeVeganCarbSet() {
        Food carb = foodFactory.getFood("Carb");
        HashSet<String> carbList = carb.getFoodOptionsList();
        carbList.remove("Cheese");
        return carbList;
    }

    private HashSet<String> makeVeganProteinSet() {
        Food protein = foodFactory.getFood("Protein");
        HashSet<String> proteinList = protein.getFoodOptionsList();
        proteinList.remove("Fish");
        proteinList.remove("Chicken");
        proteinList.remove("Beef");
        return proteinList;
    }

    private HashSet<String> makeVeganFatSet() {
        Food protein = foodFactory.getFood("Fat");
        HashSet<String> proteinList = protein.getFoodOptionsList();
        proteinList.remove("Sour cream");
        return proteinList;
    }

    private String selectRandomItem(HashSet<String> foodSet) {;
        List<String> foodList = new ArrayList<>(foodSet);
        Random random = new Random();
        int randomIndex = random.nextInt(foodList.size());
        return foodList.get(randomIndex);
    }

}
