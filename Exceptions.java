public class Exceptions{                                        
    public static void main(String args[]){                     
        int x=10,y=0,k=0;
		int a[]=new int[4];		
        try{                                                    
            int z=x/y;                                         
            for(int i=0; i<=4; i++)                             
            {                                                                                           
                a[i]=i+1;                                       
            }                                                   
        }                                                       
        catch(ArithmeticException e){                                     
                                                                
            System.out.println("Division by zero is wrong");    
        }
		
    }                                                           
}                                                               
                                                                
                                                                