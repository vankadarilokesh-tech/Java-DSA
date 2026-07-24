import java.util.Scanner;
//153 = 1 + 125 + 27
public class Amstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isAmstrong(n));

        }
        static boolean isAmstrong(int n){
        int original = n;
        int sum = 0;
        while(n > 0){
            int rem = n%10;   //153 % 10 = 3
            n = n/10;   //153 / 10 = 15
            sum = sum + rem*rem*rem;
        }
        if(sum == original){
            return true;    // or in one line we can write" return sum == original "
        }
        return false;
    }
}
// 3 digit armstrong numbers from 100 to 999
//for(int i =100;i <1000;i++){
//if(isArmstrong(i)){
//System.out.print(int i+ " ");
//               }
//        }
// then output will be 153 370 371 407




