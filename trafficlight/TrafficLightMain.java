package trafficlight;

public class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight trafficLight1 = new TrafficLight("Green", 30.0);

        System.out.println("Is it green?: " + trafficLight1.checkIfGreen());
        System.out.println("Is it red?: " + trafficLight1.checkIfRed());

        trafficLight1.setColor("Red");
        
        System.out.println("Is it green?: " + trafficLight1.checkIfGreen());
        System.out.println("Is it red?: " + trafficLight1.checkIfRed());
    }
}
