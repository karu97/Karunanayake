import java.util.Scanner;

class PrimeNumber1 {
    private static Scanner sc;
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println(" Please Enter any Number : ");
    int n = s.nextInt();
    int prime_number=1;
    for(int i=2;i<n;i++) {
        if (n % i == 0) {
            prime_number = 0;
            break;
        }
    }
    if(prime_number==1){
        System.out.println( n + " is a Prime Number");
    }
    else
    {
        System.out.println(n + " is Not a Prime Number");
    }
    }
}

