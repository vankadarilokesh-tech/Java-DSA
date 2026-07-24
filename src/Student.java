public class Student {
    int rollno;
    String name;
    float fee;
    Student(int r, String n){
        rollno=r;
        name=n;
    }
    Student(int r,String n,float f){
        this(r,n);
        fee=f;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);
    }

    public static void main(String[] args) {
        Student s1 = new Student(111,"loki");
        Student s2 = new Student(112,"mani",60000);
        s1.display();
        s2.display();
    }
}
