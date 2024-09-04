abstract class Area{
int a;
abstract public float compute(float x);
  public void display(){
    System.out.println(a);
  }
}
class Square extends Area{
    public float compute(float x){
        return (x*x);
    }
}
public class TestAbstract {
    public static void main(String ar[]){
        Square obj=new Square();
         System.out.println(obj.compute(5.0f));
    }

}
