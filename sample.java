public class sample {
    int a ,b;
    sample(){
        a=0;
        b=0;
    }
    sample(sample ob){
        a=ob.a;
        b=ob.b;
    }
    void display(){
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);


    }
}
class TestSample(){
    public static void main(String args[]){
      sample obj1 = new sample();
      obj1.display();
      sample obj2 = new sample(4,10);
      obj3.display();
      sample obj3 = new sapmple
    }
}
