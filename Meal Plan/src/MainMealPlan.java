import com.macronutrient.Macronutrient;

public class MainMealPlan {
    public static void main(String[] args) {

        Macronutrient macronutrient = Macronutrient.getInstance();
        Customer customerPaleo = new Customer("Caveman", "Paleo");
        Customer customerVegan = new Customer("Rabbit", "Vegan");
        Customer customerNutAllergy = new Customer("Kernel", "Nut Allergy");
        Customer customerNoRestrictions = new Customer("Omnivore", "No restrictions");

        System.out.println(customerPaleo.name + " " + macronutrient.createMeal(customerPaleo.dietPlan));
        System.out.println(customerVegan.name + " " + macronutrient.createMeal(customerVegan.dietPlan));
        System.out.println(customerNutAllergy.name + " " + macronutrient.createMeal(customerNutAllergy.dietPlan));
        System.out.println(customerNoRestrictions.name + " " + macronutrient.createMeal(customerNoRestrictions.dietPlan));

    }
}