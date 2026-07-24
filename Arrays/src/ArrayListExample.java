import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        //syntax

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(3);
        list.add(14);
        list.add(7);
        list.add(18);

        System.out.println(list);
        System.out.println( list.contains(14));
    }
}

