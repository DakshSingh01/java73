public class Bank {
    private int balance=10000;
    public void withdrawal(int amount){
        if(amount>balance){
            throw new InsufficientBalanceException("Cannot withdraw amount greater than balance");
        }
        else{
            balance=balance-amount;
            System.out.println("Withdrawn Successfully, Remaining Balance: "+balance);
        }
    }
}
