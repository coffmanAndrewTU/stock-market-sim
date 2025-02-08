
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockButtonController implements ActionListener{
    private Player player;
    private Stock stock;
    private boolean isBuy;
    private StockMarketGame game;

    public StockButtonController(Player p, Stock s, boolean buy, StockMarketGame g){
        player = p;
        stock = s;
        isBuy = buy;
        game = g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double price = stock.getPrice();
        if(isBuy){
            if(player.getBalance() >= price){
                player.buyStock(price);
            }
        }
        else{
            if(player.hasShares(stock)){
                player.sellStock(price);
            }
        }
        game.update();
    }

    
}
