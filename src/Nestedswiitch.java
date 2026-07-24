import java.util.Scanner;

public class Nestedswiitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();
        switch (empID){
            case 1:
                System.out.println("lokesh");
                break;
            case 2:
                System.out.println("mani");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch(Department){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "CSM":
                        System.out.println("CSM Department");
                        break;
                    default:
                        System.out.println("Incorrect");
                }
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
