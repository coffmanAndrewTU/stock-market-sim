import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvanceDayController implements ActionListener{
    private Stock stock;
    private StockMarketGame game;
    
    public AdvanceDayController(Stock s, StockMarketGame g){
        stock = s;
        game = g;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        stock.newDayPrice();
        game.update();
    }
    
}