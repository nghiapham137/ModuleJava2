public class XMLStorage implements UserStorage {
    private User user;

    @Override
    public void store(User user) {
        System.out.println(user.getName());
        System.out.println("Store user data with SML storage");

    }
}
