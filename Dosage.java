import java.util.Scanner;

class Dosage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Are you a kid, teenage or an adult? ");
        String user_input = s.nextLine();
        switch (user_input) {
            case "kid":
                System.out.println(" Take one tablet an night ");
				break;
            case "teenage":
                System.out.println(" Take one tablet an night ");
				break;
            case "adult":
                System.out.println(" Take two tablet an night ");
				break;
            default:
                System.out.println(" Invalied Input ");

        }
    }
}


