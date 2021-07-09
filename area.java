import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" calculate the area of? circle, a rectangle or a triangle ");

        String Shape  = s.nextLine();
        switch (Shape) {
            case "circle":
                System.out.println("3.14*r^2");
                break;
            case "rectangle":
                System.out.println("length*width");
                break;
            case "triangle":
                System.out.println("1/2*base*vertical heiht");
                break;
            default:
                System.out.println("Invalid Input");

        }

    }
}