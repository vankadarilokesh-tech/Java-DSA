import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("For LOOP");
        int num = in.nextInt();
        for (int n=1;n<=num;n+=1){
            System.out.print(n + " ");
        }
//        "While LOOP"
//        int n=1;
//        while(n<=num){
//            System.out.print(n + " ");
//            n += 1;
//        }
//        "DO WHILE LOOP"
//        int n=1;
//        do{
//            System.out.println(n + " ");
//            n += 1;
//
//        }while(n<=num);
    }
}
