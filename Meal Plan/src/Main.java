import com.dietplan.DietPlan;


public class Main {
    public static void main(String[] args) {

        DietPlan d = new DietPlan();
        System.out.println(d.createDietPlan("Paleo"));
        System.out.println(d.createDietPlan("Vegan"));

    }
}