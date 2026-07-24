import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float salary = 24500;
        if(salary >= 20000){
            salary = salary + 1000;
        }else{
            salary = salary + 500;
        }
        System.out.println(salary);
    }
}
