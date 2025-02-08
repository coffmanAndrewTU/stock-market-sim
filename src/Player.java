
public class Player {
    private double balance;
    private double shares;

    public Player(){
        balance = 100000;
    }

    public double getBalance(){
        return balance;
    }

    public double getShares(){
        return shares;
    }

    public void buyStock(double price){
        balance -= price;
        shares++;
    }

    public void sellStock(double price){
        balance += price;
        shares--;
    }

    public boolean hasShares(Stock s){
        if(shares>0){
            return true;
        }
        return false;
    }
}
