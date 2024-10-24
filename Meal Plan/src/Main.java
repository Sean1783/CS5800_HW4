import com.dietplan.DietPlan;


public class Main {
    public static void main(String[] args) {

        DietPlan d = new DietPlan();
        System.out.println(d.makeMealPlan("Paleo"));
        System.out.println(d.makeMealPlan("Vegan"));
        System.out.println(d.makeMealPlan("Nut Allergy"));

    }
}