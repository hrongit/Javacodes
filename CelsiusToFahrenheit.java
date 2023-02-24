public class CelsiusToFahrenheit {
    public static void main(String args[]) {
        double celsius, fahren;
        Scanner scanner;
        scanner = new Scanner(System.in);
        // Take temperature in Celsius as input from user
        System.out.println("Enter Temperature in Celsius");
        celsius = scanner.nextFloat();
 
        fahren = (9.0 / 5.0) * celsius + 32;



 
        System.out.print("Temperature in Fahrenheit = " + fahren);
    }
}



/*
 import java.io.*;
import java.util.*;
import java.util.Scanner;
class FC
{
    public static void main(String arg[])    
    {
        double f,c;
        Scanner sc=new Scanner(System.in);

        System.out.println("Choose type of conversion \n 1.FORENHITE to CELCIUS  \n 2.CELCIUS to FORENHITE");
        int ch=sc.nextInt();
        switch(ch)
        {
        case 1:  System.out.println("Enter  Fahrenheit temperature");
            f=sc.nextDouble();
            c=(f-32)*5/9;
            System.out.println("Celsius temperature is = "+c);
          break;
        case 2:  System.out.println("Enter  Celsius temperature");
            c=sc.nextDouble();
            f=((9*c)/5)+32;
            System.out.println("Fahrenheit temperature is = "+f);
          break;
       default:  System.out.println("please choose valid choice");
       }  
    } 
}
 */