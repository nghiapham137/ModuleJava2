public class Demo {
    public static void main(String[] args) {
        UserController userController = new UserController(new XMLStorage());
        User user1 = new User("Nam", "HN");
        userController.store(user1);
        System.out.println();
        UserController userController1 = new UserController(new MySQLStorage());
        User user2 = new User("Long", "NA");
        userController1.store(user2);
    }

}
