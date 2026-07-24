abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

    public void display() {
        System.out.println("The dimensions are");
        System.out.println(dim1);
        System.out.println(dim2);
    }
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

public class Abstracton {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 6);
        Figure ref = r;

        ref.display();
        System.out.println("Area of Rectangle is " + ref.area());
    }
}