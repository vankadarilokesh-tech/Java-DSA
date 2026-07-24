public class Shadowing {
    static  int x = 70;//shadowing
    public static void main(String[] args) {
        System.out.println(x);// 70
        int x = 30;
        System.out.println(x);// 30
        fun();// 70
    }
    static void fun(){
        System.out.println(x);
    } 
}
