public class Twitter implements  SocialShare{
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void share() {
        System.out.println("Sharing to Twitter: " + this.message);
    }
}
