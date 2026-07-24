import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        // trim() : removes extra spaces between strings
        // Acessing the positon(index)
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        }else if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }

    }
}
