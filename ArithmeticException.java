public class ArithmeticException { 
	public static void main(String args[]){
	int x=10;
	int y=0;
	try{
		int z=x/y;
		System.out.println("Sum of x+y = " +z);
	}
	catch(Exception e){
		
		System.out.println(e);
	}
	System.out.println("Hello");
	}
}	
