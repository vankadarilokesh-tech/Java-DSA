import java.util.Scanner;

// 0 , 1 , 1 , 2 , 3 , 5 , 8 , 13 , ..................
public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// for nth number
        int a = 0;// previous number
        int b = 1;// current number
        int count = 2;
        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);

    }

                                                           // a    b
                                                           // 0    1
                                                          //  1    1
                                                          //  1    2
}                                                         //  2    3






























