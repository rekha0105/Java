import java.util.*;


interface Shape {
    void area(double x, double y); 
}

class Rectangle implements Shape {
    
    public void area(double x, double y) {
        double area = x * y; 
        System.out.println("Area of Rectangle: " + area);
    }
}

class Circle implements Shape {
    public void area(double x, double y) {
        double area = 3.14 * x * x; 
        System.out.println("Area of Circle: " + area);
    }
}

class Triangle implements Shape {

    public void area(double x, double y) {
        double area = 0.5 * x * y; 
        System.out.println("Area of Triangle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        rectangle.area(2, 5);
        Shape circle = new Circle();
        circle.area(5, 0);
        
        Shape triangle = new Triangle();
        triangle.area(2, 5); 
    }
}