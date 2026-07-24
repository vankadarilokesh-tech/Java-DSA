public class Scopping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name ="mani";
        {
            a = 100;
            System.out.println(a);
            name = "loki" ;
            System.out.println(name);

        }
        System.out.println(a);
        System.out.println(name);
    }
}
