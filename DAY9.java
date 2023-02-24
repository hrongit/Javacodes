import java.util.Scanner;

public class DAY9 {

    private static final char[] Invalid = null;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);


        int X = reader.nextInt();

        if(X > 450)
            System.out.println(X + X*0.18);
        else
            System.out.println("Invalid Input");


        
    }

}


/*

method 2 


 * import java.io.*;
import java.util.*;

public class Solution {
    
    
    
    static boolean isInteger(double N)
{
 
    // Convert float value
    // of N to integer
    int X = (int)N;
    double temp2 = N - X;
 
    // If N is not equivalent
    // to any integer
    if (temp2 > 0)
    {
        return false;
    }
    return true;
}
    
    

    public static void main(String[] args) {
         Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
        Scanner s = new Scanner(System.in);
        float price;
        float y;
        price = s.nextFloat();
        y = (((18 * price) / 100));

        
        if(price<450){
            System.out.println("Invalid Input");
        }
        else{
            
            if (isInteger(y)) {
            int intRate = (int) y;
            int intprice = (int) price;
            System.out.println(intprice + intRate);
        } else {
            int intprice = (int) price;
            System.out.println(intprice + y);

        }       
        }   
    }
}
 */