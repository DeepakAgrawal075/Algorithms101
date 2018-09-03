import org.apache.commons.lang3.StringUtils;

class StringReverse {
    static String reverse(String input) {
        if (StringUtils.isEmpty(input) || input.length() == 1) {
            return input;
        }
        return reverse(input.substring(1)) + input.charAt(0);
    }
}