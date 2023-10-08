package Sep23.inheritence.mutlilevel;

//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
public class Shape {
    public double getArea(){
        return 0.0;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    //Parameterized Constructor
    Rectangle(double length , double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return length*width;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3.0,10.0);
        double area = rectangle.getArea();
        System.out.println("The area of the rectangle is: "+ area);
    }
}