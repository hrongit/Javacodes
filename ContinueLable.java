public class ContinueLable {
    public static void main(String[] args) {
        outer: for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(j>i)
                {
                    System.out.println("Hi");
                    continue outer;
                }
                System.out.println(" "+(i*j));
            } 
}
System.out.println("Done");
    }
}
