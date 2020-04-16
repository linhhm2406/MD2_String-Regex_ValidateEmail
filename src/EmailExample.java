import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    public final String EMAIL_FORM = "\\w+\\w*@\\w+\\.\\w+";

    public EmailExample(){
        pattern = pattern = Pattern.compile(EMAIL_FORM);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
