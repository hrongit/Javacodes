public class ParameterizedConstructors {
    private int length;
    private int breadth;
    private int height;
    
    public ParameterizedConstructors() {
        length = 10;
        breadth = 10;
        height = 10;
    }
    
    public ParameterizedConstructors(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }
    
    public int getVolume() {
        return length * breadth * height;
    }
    
    public static void main(String[] args) {
        ParameterizedConstructors c1 = new ParameterizedConstructors();
        ParameterizedConstructors c2 = new ParameterizedConstructors(10, 20, 30);
        System.out.println("Volume of Cube1: " + c1.getVolume());
        System.out.println("Volume of Cube2: " + c2.getVolume());
    }
}
