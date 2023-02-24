public class inst {
    public static void main(String arg[]){
    String name = "HELLO";
    boolean result1 = name instanceof String;
    System.out.println( result1);
    
        inst obj = new inst();
        boolean result2 = obj instanceof  inst;
        System.out.print(result2);
    }
    }