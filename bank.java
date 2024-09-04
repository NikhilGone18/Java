public class bank {
    private double balance;
    public bank(double initialBalance){
        if(initialBalance < 0){
            throw new IllegalArgumentException("The initial balance cannot be neagtive !");
        }
        this.balance = initialBalance ;
    }
    public void  deposit(double amount){
        if(amount < 0){
            throw new IllegalArgumentException("The deposit amount can not be negative !");
        }
        balance += amount;
        System.out.println("Deposit = "+ amount );
    }
    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("The withdraw amout should not be greater than balance !");
        }
        balance -= amount;
        System.out.println("Withdraw = "+ amount);
    }
    public double  checkbalance(){
        return balance;
    }
    public static void main(String args[]){
        bank acount1 = new bank(1000);
      acount1.deposit(200);
      acount1.withdraw(400);
      acount1.withdraw(200);
      System.out.println("Balance is "+acount1.checkbalance());
/*
 byte
 long
 double
 float
 char
 short
 int
 boolean
 */
    

    }
}
