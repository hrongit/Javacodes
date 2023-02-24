class Parent{}
class Child extends Parent{}
class TestInstanceOf{
        public static void main(String[] rk){
            Parent p = new Parent();
            Child c = new Child();
            System.out.print(p instanceof Child);
            System.out.print(p instanceof Parent);
            System.out.print(c instanceof Parent);

        }
    }


    