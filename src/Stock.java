public class Stock {
    private double price;

    public Stock(){
        price = Math.round(Math.random() * 10000)/100; //generate a price between 0 and 100 dollars
    }

    public void newDayPrice(){
        price = price + Math.round((Math.random()-0.5) * price/5);
    }

    public double getPrice(){
        return price;
    }
}
