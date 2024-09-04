 public class BalanceCheck {
    
    public static void main(String [] args){
        double balance = 1000;
        checkBalance(balance);
}
public static void checkBalance(double balance) {
         
    if (balance < 1000) {
        System.out.println("Balance is low");
    } else {
        System.out.println("Sufficient balance");
    }
}
}
