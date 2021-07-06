import java.util.Scanner;
class nameoftheday{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter week number (1-7): ");
		char selection = input.nextLine() .charAt(0);
			if (selection == '1'){
			System.out.println("Monday");
	}		
			else if (selection == '2'){
			System.out.println("Tuesday");
	}
			else if (selection == '3'){
			System.out.println("Wednesday");
	}
			else if (selection == '4'){
			System.out.println("Wednesday");
	}
			else if (selection == '5'){
			System.out.println("Friday");
	}
			else if (selection == '6'){
			System.out.println("Saturday");
	}
			else if (selection == '7'){
			System.out.println("Sunday");
	}
			else if (selection>8){
			System.out.println("Invalid Deta");
	}
			else if (selection<1){
			System.out.println("Invalid Deta");
	}
	
}
}	