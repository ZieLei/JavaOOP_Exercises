package rectangle;

public class Rectangle {
    double height, width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }
 
    public double getWidth(){
        return this.width;
    }
}
