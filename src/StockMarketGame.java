import javax.swing.*;
import java.awt.*;

public class StockMarketGame extends JPanel{
    private Player player;
    private Stock stock; //this will need to be an arraylist later
    private JLabel playerBalance;
    private JLabel stockPrice;
    private JLabel stockShares;

    public StockMarketGame(Player p, Stock s){
        player = p;
        stock = s;

        this.setLayout(new GridLayout(2, 5));

        JLabel playerInfo = new JLabel("Player Balance");
        this.add(playerInfo);
        playerBalance = new JLabel(String.valueOf(player.getBalance()));
        this.add(playerBalance);
        for(int i = 0; i<2; i++){
            this.add(new JPanel());
        }
        JButton advanceDay = new JButton("Advance Day");
        advanceDay.addActionListener(new AdvanceDayController(stock, this));
        this.add(advanceDay);


        JLabel stockInfo = new JLabel("Stock Price and Shares Held");
        this.add(stockInfo);
        stockPrice = new JLabel(String.valueOf(stock.getPrice()));
        this.add(stockPrice);
        stockShares = new JLabel(String.valueOf(player.getShares()));
        this.add(stockShares);
        JButton buyStock = new JButton("Buy");
        buyStock.addActionListener(new StockButtonController(player, stock, true, this));
        this.add(buyStock);
        JButton sellStock = new JButton("Sell");
        this.add(sellStock);
        sellStock.addActionListener(new StockButtonController(player, stock, false, this));

        

    }

    public void update(){
        playerBalance.setText(String.valueOf(player.getBalance()));
        stockPrice.setText(String.valueOf(stock.getPrice()));
        stockShares.setText(String.valueOf(player.getShares()));
    }

}