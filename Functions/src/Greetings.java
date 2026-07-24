import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String name = in.next();
        String message = mygreet(name);
        System.out.println(message);

    }
    static String mygreet(String name){
        String greet = "Hello " + name;
        return greet;
    }
}
