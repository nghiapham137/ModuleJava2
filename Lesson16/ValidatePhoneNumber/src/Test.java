public class Test {

    public static final String[] validPhoneNumber = new String[] {"(84)-(0978489648)", "(32)-(0978489648)"};
    public static final String[] invalidPhoneNumber = new String[] {"(a8)-(22222222)", "(84)-(1978489648)", "(8)-(0978489648)", "(84)-(097848964a)"};

    public static void main(String[] args) {
        PhoneNumberExampe phoneNumberExampe = new PhoneNumberExampe();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExampe.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExampe.validate(phoneNumber);
            System.out.println("Phone number is: " + phoneNumber + "is valid: " + isvalid);
        }
    }
}
