package switchPrograms;

public class TrafficLight {
    public static void main(String[] args) {
        String light = "red";

        switch (light.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;
            case "yellow":
                System.out.println("Slow Down");
                break;
            case "green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Invalid light color");
                break;
        }
    }
}

