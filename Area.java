import java.util.*;
public class Area {
    private double length;
    private double breadth;
    public void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
         
    }
    public  double getArea(){
        return length*breadth;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle : ");
        double breadth = sc.nextDouble();
           Area rectangle = new Area();
           rectangle.setDim(length,breadth);
           System.out.println("The area of the rectangle is : "+rectangle.getArea());

    }
}
