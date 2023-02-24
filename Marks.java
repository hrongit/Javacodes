class MarksDemo {
    

    int engMarks;
    int mathsMarks;
    int phyMarks;


    
}

class Marks{
    public static void main(String args[])
    {
        MarksDemo obj1 = new MarksDemo();
        obj1.mathsMarks = 80;
        obj1.phyMarks = 90;

        MarksDemo obj2 = new MarksDemo();
        obj2.engMarks = 80;
        obj2.mathsMarks = 60;
        obj2.phyMarks = 85;

        System.out.println("Marks for first object:");
        System.out.println(obj1.engMarks);
        System.out.println(obj1.mathsMarks);
        System.out.println(obj1.phyMarks);



        System.out.println("Marks for second object:");
        System.out.println(obj2.engMarks);
        System.out.println(obj2.mathsMarks);
        System.out.println(obj2.phyMarks);



    }
}