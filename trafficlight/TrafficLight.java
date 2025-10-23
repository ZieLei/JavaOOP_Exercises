package trafficlight;

public class TrafficLight {

    private String color;
    private double duration;
    
    public TrafficLight(String color, double duration){
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getColor() {
        return color;
    }

    public double getDuration() {
        return duration;
    }

    public boolean checkIfGreen(){
        return color == "Green";
    }

    public boolean checkIfRed(){
        return color == "Red";
    }
}
