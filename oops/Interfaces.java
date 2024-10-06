public class Interfaces{
    public static void main(String[] args) {
    humanbeing jay =new humanbeing();
    jay.eat();
    jay.type();
    }
    }
interface animal{
    void eat();
}
interface mammals{
    void type();
}
class humanbeing implements animal, mammals{
public void eat(){
    System.out.println("rice");}
public void type(){
     System.out.println("living being");
}}

