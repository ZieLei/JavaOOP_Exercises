package rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(20.6, 30.8);
        System.out.println("Rectangle height: " + rectangle1.getHeight() + " Rectangle width: " + rectangle1.getWidth());
        System.out.println("Area: " + calculateArea(rectangle1.getHeight(), rectangle1.getWidth()) + " Rectangle perimeter: " + calculatePerimeter(rectangle1.getHeight(), rectangle1.getWidth()));
    }   
    
    public static double calculateArea(double height, double width){
        return height * width;
    }

    public static double calculatePerimeter(double height, double width){
        return 2 * (height + width);
    }
}
