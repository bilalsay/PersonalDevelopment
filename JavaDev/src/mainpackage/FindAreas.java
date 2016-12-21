package mainpackage;

/**
 * Created by bilalsay on 08.10.2016.
 */

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }


    double area() {
        System.out.println("Inside area for rectangle ");
        return super.dim1 * super.dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Triangle ");
        return (super.dim1 * super.dim2) / 2;
    }

}



public class FindAreas {
    public static void main(String args[]) {
       // Figure f = new Figure(10, 10); // Soyut bir class ın nesnesi oluşturulamaz
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef;

        figRef = r;
        System.out.println("Area is " + figRef.area());

        figRef = t;
        System.out.println("Area is " + figRef.area());


    }

}
