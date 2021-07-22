 class multiplythreenumbers{
	public int addNumbers(int a, int b, int c){
		int multiply = a * b * c;
		return multiply;
	}

	public static void main (String args[]){
		int num1 = 10, num2 = 20, num3 = 30, result;
		multiplythreenumbers y = new multiplythreenumbers();
		result = y.addNumbers(num1, num2, num3);
		System.out.println("multiply of " + num1+" , " + num2 + " and " + num3 + " is " + result);
 	}
}