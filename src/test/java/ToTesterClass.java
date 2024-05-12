import StringOperator.StringOperator;
import org.example.Main;
import org.junit.Test;

public class ToTesterClass {
    @Test public void test() {
        for (int i = 0; i < 1000; i++){
            String string1 = Main.randomString(20, true, true);
            String string2 = Main.randomString(20, true, true);;
            int actual = StringOperator.stringOperator(string1, string2);
            int expected = string1.compareTo(string2);
            if (actual == expected){
                System.out.println("---------test "  + (i + 1) + " is successful");
            }
            else{
                System.out.println("---------test " + (i + 1) + " is invalid");
            }
        }
    }
}
