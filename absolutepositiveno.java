import java.util.Scanner;

public class absolutepositiveno {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);


        int num = reader.nextInt();

        if(num < 0)
            System.out.println(num*(-1));
        else
            System.out.println(num);

    }

}




/* 

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
       
        Scanner s=new Scanner(System.in);
        int  a,b,c,final_1;
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();
        
        int disc_a=10*(a/100);
        int a_f=a-disc_a;
        
        int disc_b=20*(b/100);
        int b_f=b-disc_b;
        
        int disc_c=30*(c/100);
        int c_f=c-disc_c;
        
            a_f = a_f ;
            b_f = b_f*2 ;
            c_f = c_f*3;
         final_1 = a_f+b_f+c_f;
        System.out.println(final_1);
        
        
        
    }
}

*/


