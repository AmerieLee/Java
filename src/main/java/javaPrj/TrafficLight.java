package javaPrj;

public class TrafficLight {
    public static void main(String[] args) {
        light("RED");
        light("YELLOW");
        light("GREEN");
        light("BLUE");
    }

    // A method that inputs a color and outputs a traffic light.
    public static void light(String color) {
        switch (color) {
            case "RED":
                System.out.println("The red light comes on.");
                break;
            case "YELLOW":
                System.out.println("The yellow light comes on.");
                break;
            case "GREEN":
                System.out.println("The green light comes on..");
                break;
            default:
                System.out.printf("error, Incorrect color input: %s\n", color);
        }
    }
}