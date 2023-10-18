import org.apache.commons.lang3.StringUtils; //does not come with java comes from a different library

import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        //System.out.println("Give me a string");
        //String input = scanner.nextLine();
        //System.out.println("You entered: \"" + input + "\"");
        System.out.println("Enter Something: ");
        String input = scanner.nextLine();
        System.out.println("You entered: \"" + input + "\"");

        System.out.println("Reverse Case: \"" + StringUtils.reverse(input) + "\"");
        System.out.println(StringUtils.capitalize(input));

    }

}
