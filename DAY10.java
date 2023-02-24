import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class DAY10 {

    public static void main(String args[]) {
        double c, f;
        Scanner scanner;
        scanner = new Scanner(System.in);
        NumberFormat numberFormat= NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);
        
        
        f = scanner.nextInt();
        
     
        c =(f-32)*5/9;
        
        
        if(f >= 95 && f <= 105)
            System.out.print(numberFormat.format(c));
         else
             System.out.print("Invalid");                


        
    }
}

/*
 * import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        double b= (a-32)*(double)0.555;
        if (a>=95 && a<=105)
            System.out.printf("%.1f",(float)b);
        else
            System.out.print("Invalid");
    }
}
 */