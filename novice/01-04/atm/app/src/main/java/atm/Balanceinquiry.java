package atm;

public class Balanceinquiry extends ATMMachine{
    static double balance =0;
    public void setBalance(double b)
    {
        balance=b;
    }
    public static double getBalance()
    {
        return balance;
    }
}
