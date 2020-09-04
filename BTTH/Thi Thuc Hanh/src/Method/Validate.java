package Method;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    public static final String ID_REGEX = "^[F|P][T]\\d{4}$";
    public static final String PHONENUMBER_REGEX = "^[0]\\d{9}";
    public static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public static boolean validate(String string, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
