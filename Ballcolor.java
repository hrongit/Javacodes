
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.util.Scanner;

public class Ballcolor {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        Float a = reader.nextFloat();
      
        System.out.print(Math.round(++a));
        
        NumberFormat numberFormat= NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);

        Float b = reader.nextFloat();
        
        System.out.print(" " + numberFormat.format(b));


        Float c = reader.nextFloat();
        
        
        System.out.print(" " + numberFormat.format(c));
        
    }
    
}


