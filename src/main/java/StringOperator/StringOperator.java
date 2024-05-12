package StringOperator;
public class StringOperator {
    public static int stringOperator(String string1, String string2) {
        int minval = Math.min(string1.length(), string2.length());
        for (int i = 0; i < minval; i++) {
            if (string1.charAt(i) != string2.charAt(i)){
                return string1.charAt(i) - string2.charAt(i);
            }
        }
        if (string1.length() < string2.length()){
            return -1;
        }
        else if (string1.length() > string2.length()){
            return 1;
        }
        return 0;
    }
}
