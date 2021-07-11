import java.util.Scanner;
    class Calculator {
        public static void main (String args[]){
            char operator;
            double  number1,number2;
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the operator (+, -, *, / ");
            operator = input.next().charAt(0);

            System.out.println("Enter the 1st numbers");
            number1 = input.nextDouble();
			
			System.out.println("Enter the 2nd numbers");
            number2 = input.nextDouble();
            input.close();
			
            switch( operator ) {
                case '+' :
                    System.out.printf("%f + %f = %f", number1, number2, (number1+number2) );
                    break;
                case '-' :
                    System.out.printf("%f - %f = %f", number1, number2, (number1-number2) );
                    break;
                case '*' :
                    System.out.printf("%f * %f = %f", number1, number2, (number1*number2) );
                    break;
                case '/' :
                    System.out.printf("%f / %f = %f", number1, number2, (number1/number2) );
                    break;

                    
            } 
        }
}
