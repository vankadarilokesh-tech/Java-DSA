public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12,345, 2, 6, 7896};// ans = 2
        System.out.println(findnumbers(nums));
    }
    static int findnumbers(int[] nums){
        int count = 0;
        for(int num : nums){                             
            if(even(num)){
             count++;
            }
        }
        return count;
    }
    static  boolean even(int num){
        int Digits = Digitsinnum(num);
        return Digits % 2 ==0;
    }
    static int Digitsinnum(int num){
        int count =0;
        while(num> 0){
            num /= 10;
            count++;
        }
        return count;
    }
}
