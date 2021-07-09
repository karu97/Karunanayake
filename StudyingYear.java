import java.util.Scanner;

public class StudyingYear {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Are you which year of university? ");
        int year = s.nextInt();
        switch (year) {
            case 1:
                System.out.println("you have lectures on Monday and Fridays");
                break;
            case 2:
                System.out.println("you have lectures on Mondays, Wednesdays and Fridays");
                break;
            case 3:
                System.out.println("you have lectures on Tuesdays, Wednesdays and Thursdays");
                break;
            default:
                System.out.println("Invalid Input");

        }

    }
}
