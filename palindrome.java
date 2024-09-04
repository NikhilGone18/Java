import java.util.*;
public class palindrome {
    public static void main(String[] args){
        int reverse=0;
        int digit=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        while(number!=0){
            digit=number%10;
            reverse=reverse*10+digit;
            number/=10;
        }
      if(reverse==number){
        System.out.println("The given number is a palindrome");
      }else{
        System.out.println("The given numbe is not a palindrome");
      }

    }
}
