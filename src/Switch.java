import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit){
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A Round fruit");
                break;
            case "Grapes":
                System.out.println("A Small fruit");
                break;
            default:
                System.out.println("Please enter a Valid fruit");
        }
    }
}
