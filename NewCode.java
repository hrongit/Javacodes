class Data{
    private String name;
    public  String getName(){
        return this.name;

    }
    public void setName(String name){
        this.name = name;
    }
}



public class NewCode {
    public static void main(String args[]){
        Data d = new Data();
        d.setName("priya");
        System.out.println(d.getName());
;    }

}