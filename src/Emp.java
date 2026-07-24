public class Emp {
 int id;
 String name;
 double salary;
 void insert( int i,String n ,double s){
     id = i;
     name = n;
     salary = s;
    }
    void display(){
        System.out.println(id+" "+name+" "+salary);
    }

    public static void main(String[] args) {
        Emp e1= new Emp();
        Emp e2= new Emp();
        Emp e3= new Emp();
        e1.insert(87,"lokesh",900000);
        e2.insert(89,"mani",950000);
        e3.insert(66,"adhi",950000);
        e1.display();
        e2.display();
        e3.display();

    }
}
