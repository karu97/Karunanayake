import java.util.Scanner;
class telephonecode{

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter telephone code: ");	
		String selection = input.nextLine();
		
			if (selection.equals("11")){
			System.out.println("Anuradhapura");
	}		
			else if (selection.equals("22")){
			System.out.println("Polonnaruwa");
	}
			else if (selection.equals("33")){
			System.out.println("Sigiriya");
	}
			else if (selection.equals("40")){
			System.out.println("Colombo");
	}
			else if (selection.equals("55")){
			System.out.println("Kelaniya");
	}
			else if (selection.equals("66")){
			System.out.println("Kandy");
	}
			else if (selection.equals("77")){
			System.out.println("Galle");
	}
			
}
}	