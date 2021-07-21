class sumofthree{
	public static int addNumbers(int a, int b, int c){
		int sum = a + b + c;
		return sum;
	}
	
	public static void main(String args []){
		int num1 = 10, num2 = 20, num3 = 1000, result;
		sumofthree y = new sumofthree();
		result = y.addNumbers(num1, num2, num3);
		System.out.println("Sum of " + num1+" , "+ num2 + " and " + num3 + " is " + result);
	}
}
	
