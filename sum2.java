import java.util.*;
public class sum2 {
    static int sumofDigits(int number){
        int sum =0;
        while(number != 0){
        
            int digit = number %10;
            sum = sum + digit;
            number /= 10;

        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        int sumofDigits = sumofDigits(number);
System.out.println("The sum of the digits is : "+ sumofDigits);
    }
}
