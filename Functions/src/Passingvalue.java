public class Passingvalue {
    public static void main(String[] args) {
        String naam = "loki";
        changename(naam);
       // System.out.println(naam);
        //
    }
    static void changename(String name){
        name = "Bhai"; // not changing , creating a new object
        System.out.println(name);

    }
}
//primitives: int,short,clear,byte...->just passing value
//objects and stuff : passing value of the reference variable(naam and name)