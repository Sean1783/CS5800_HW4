import com.macronutrient.Macronutrient;


public class Main {
    public static void main(String[] args) {

        Macronutrient macronutrient = Macronutrient.getInstance();
        Customer customerPaleo = new Customer("Caveman", "Paleo");
        Customer customerVegan = new Customer("Rabbit", "Vegan");
        Customer customerNutAllergy = new Customer("Kernel", "Nut Allergy");
        Customer customerNoRestrictions = new Customer("Omnivore", "No restrictions");

        System.out.println(macronutrient.createMeal(customerPaleo.dietPlan));
        System.out.println(macronutrient.createMeal(customerVegan.dietPlan));
        System.out.println(macronutrient.createMeal(customerNutAllergy.dietPlan));
        System.out.println(macronutrient.createMeal(customerNoRestrictions.dietPlan));

    }
}