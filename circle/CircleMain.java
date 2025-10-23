package circle;

public class CircleMain {
    public static void main(String[] args) {
        Circle circle = new Circle(26.5);
        
        System.out.println("Circle radius: " + circle.getRadius());
        System.out.println("Circle area: " + calculateArea(circle.getRadius()) + " Circle circumerence: " + calculateCircumference(circle.getRadius()));
    }

    public static double calculateArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateCircumference(double radius){
        return 2 * Math.PI * radius;
    }
}
