public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        Person person = new Person("Hritik Raj", 21);
        System.out.println(person.getName()); 
        System.out.println(person.getAge()); 
        System.out.println(person.toString()); 
    }
}











































