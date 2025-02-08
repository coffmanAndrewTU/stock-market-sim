import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Stock Market Game");
            Player testPlayer = new Player();
            Stock testStock = new Stock();

            JPanel game = new StockMarketGame(testPlayer, testStock);

            frame.add(game);

            frame.setSize(1000, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
