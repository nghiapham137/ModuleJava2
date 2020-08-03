public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Checken: cuc tac!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
