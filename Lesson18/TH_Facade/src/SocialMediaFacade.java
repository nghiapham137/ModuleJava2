public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private Linkedin linkedin;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, Linkedin linkedin) {
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
    }

    public void share(String message) {
        this.twitter.setMessage(message);
        this.facebook.setMessage(message);
        this.linkedin.setMessage(message);
        this.twitter.share();
        this.facebook.share();
        this.linkedin.share();
    }
}
