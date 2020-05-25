import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsCurrencyChecker {
    public static Matcher getMatcher(String usCurrencyString) {
        String patternString = "\\$\\s?\\d+(\\.\\d{1,2})?";

        Pattern pattern = Pattern.compile(patternString);

        Matcher matcher = pattern.matcher(usCurrencyString);

        return matcher;
    }
}
