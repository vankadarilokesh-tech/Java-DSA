public class Reverse {
    public static void main(String[] args) {
//        n = 23597
//        ans = 0
//        ans = 7*10 + 9 = 79
//        ans = 79*10 + 5 = 795...
        int num = 23597;
        int ans = 0;
        while(num>0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num/10;

        }
        System.out.println(ans);
    }
}
