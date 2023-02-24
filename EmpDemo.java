class Emp {

    public static double salary;
    public static String name = "Harsh";

    
}


public class EmpDemo{
    public static  void main(String arg[])
    {


        Emp.salary  = 1000;
        System.out.println(Emp.name + " 's average salary:" + Emp.salary);
    }


}
