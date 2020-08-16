import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExampe {
//    Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
//    x là ký tự số
//    Không chứa các ký tự đặc biệt

    private static final String PHONE_NUMBER_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public PhoneNumberExampe() {}

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }


}
