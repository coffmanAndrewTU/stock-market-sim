import javax.swing.*;

public class StockMarketGame extends JPanel{
    private Player player;
    private Stock stock; //this will need to be an arraylist later

    public StockMarketGame(Player p, Stock s){
        player = p;
        stock = s;
    }
}