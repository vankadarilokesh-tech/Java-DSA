// n = 137567947
// count of 7 = 3 times
public class CountOccur {
    public static void main(String[] args) {

        int n = 137567947;
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 7) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }

}
