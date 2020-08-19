public class TacoMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Getting tacos and vegetables");
    }

    @Override
    public void cook() {
        System.out.println("Cooking everything");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning things");
    }


}
