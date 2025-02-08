
public class Player {
    private double balance;

    public Player(){
        balance = 100000;
    }

    public double getBalance(){
        return balance;
    }

    public void buyStock(double price){
        balance -= price;
    }

    public void sellStock(double price){
        balance += price;
    }
}
