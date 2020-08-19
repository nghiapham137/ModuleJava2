public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting burgers, buns, and french fries");
    }

    @Override
    public void cook() {
        System.out.println("Cooking burgers");
    }

    @Override
    public void cleanUp() {
        System.out.println("Throwing away paper plates");
    }
}
