import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(999.98766f);
        System.out.println(num);
        int a =  257;         // maximum no. a byte can store is '256'
        byte b = (byte)(a);  // 257 % 256 = 1
        System.out.println(b);

        byte x = 20;
        byte y = 30;
        byte z = 100;
        int d = x*y/z;
        System.out.println(d);
//        byte c = 50;
//        c = c * 50;  cannot possible...
        // ascii value
        int number = 'Z';
        System.out.println(number);
        byte b1 = 42;
        char c1 = 'a';
        short s = 1024;
        int i = 5000;
        float f = 5.67f;
        double d1 = 0.1234;
        double result = (f*b1) + (i/c1) - (d1*s);
        //float + int + double(big) = double;
        System.out.println((f*b1) + " " + (i/c1) + " " +(d1*s));
        System.out.println(result);
//        238.14   51   126.3616
//        162.7784146484375
    }
}
  