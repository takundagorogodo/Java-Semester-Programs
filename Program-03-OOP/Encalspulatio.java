class Human{
    private int age= 11;
    private String name = "Navim";

    public int getAge(){
         return age;
    }

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }
}
public class Encalspulatio {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(23);
        obj.setName("takunda");

        System.out.println(obj.getAge());
        System.out.println(obj.getName());

    }
}
