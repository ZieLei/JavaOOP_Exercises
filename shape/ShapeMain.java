package shape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle = new Circle(20.80);
        Rectangle rectangle = new Rectangle(13.67, 20.9);
        Triangle triangle = new Triangle(29.7, 20.7, 10.8);

        System.out.println( "Circle area: " + circle.getArea() +
                            "\nCircle perimeter: " + circle.getPerimeter() + 
                            "\nRectanggle area: " + rectangle.getArea() + 
                            "\nRectangle perimeter: " + rectangle.getPerimeter() + 
                            "\nTriangle area: " + triangle.getArea() + 
                            "\nTriangle perimeter: " + triangle.getPerimeter());
    }
}
