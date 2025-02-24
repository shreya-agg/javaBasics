package switchPrograms;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 25;

        switch (age / 10) {
            case 0:
            case 1:
                System.out.println("Child");
                break;
            case 2:
                System.out.println("Young Adult");
                break;
            case 3:
            case 4:
                System.out.println("Adult");
                break;
            case 5:
            case 6:
                System.out.println("Middle-Aged");
                break;
            default:
                System.out.println("Senior");
                break;
        }
    }
}
