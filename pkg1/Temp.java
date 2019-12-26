package pkg1;
import pkg.*;
class Hel extends B{
static {
 System.out.println();
}
public void T(){
    System.out.println(this.data);
}
}
public class Temp extends Hel{
    public static void main(String []args){

        System.out.println("Temp");
    }
 public void display(){
     System.out.println(this.data);
 }
}