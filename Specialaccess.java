import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner2.nextLine();
        System.out.println("Hello, " +name);

        if (Objects.equals(name, "Paul")) {

            try {
                System.console().readLine("Type special keyword: ");
                System.out.println("Keyword Accepted.");
            } catch (NullPointerException e) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Type special keyword: ");
                scanner.nextLine();
                System.out.println("Keyword Accepted.");
            }
        }
        else
            System.out.println("Please wait for approval.");
    }
}