import org.apache.commons.lang3.StringUtils;
import utils.Input;

public class MavenTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("""
                Enter something here:
                """);
        String userInput = input.getString();
        System.out.printf("""
                You entered %s
                """, userInput);
        System.out.println("Swapped Cases: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed Cases: " + StringUtils.reverse(userInput));






}
