
import java.util.Scanner;
class GoToSchool{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Press \"s\" to sunny day");
	System.out.println("Press \"r\" to rainy day");
	char selection = input.nextLine() .charAt(0);
	if (selection == 's'){
		System.out.println("present");
	}		
	else if (selection == 'r'){
		System.out.println("absent");
	}
}
}	