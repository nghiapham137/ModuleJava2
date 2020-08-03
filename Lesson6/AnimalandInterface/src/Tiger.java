public class Tiger extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: roar!";
    }

    @Override
    public String howToEat() {
        return "can eat this";
    }
}
