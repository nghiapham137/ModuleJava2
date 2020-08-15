public class Test {
    private static ClassNameExample classNameExample;

    public static final String[] validClassName = new String[] {"C0318G","P5321M","A9123H"};
    public static final String[] invalidClassName = new String[] {"M0318G","P0323A","C031G"};
    public static void main(String[] args) {
        classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Classname is: " + className + " is valid: " + isValid);
        }
        for (String className : invalidClassName) {
            boolean isValid = classNameExample.validate(className);
            System.out.println("Classname is: " + className + " is valid: " + isValid);
        }
    }
}
