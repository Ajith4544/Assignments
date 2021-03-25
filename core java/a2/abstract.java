abstract class animal{
abstract void sound();
}
class cat extends animal{
void sound(){
System.out.println("cat says meow meow ");
}}

class dog extends animal{
 void sound(){
System.out.println("dog says bow bow");
}}

public class abstract{
public static void main(String args[])
{
animal l=new cat();
animal d=new dog();
l.sound();
d.sound();
}}