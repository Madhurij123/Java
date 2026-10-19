import java.util.HashMap;
import java.util.Map;

public class TradingPlatform {

    private Map<String, Stock> market = new HashMap<>();

    public void addStock(Stock stock) {
        market.put(stock.getSymbol(), stock);
    }

    public void displayMarket() {
        System.out.println("\nMarket Data:");
        market.values().forEach(s ->
                System.out.println(s.getSymbol() + " : $" + s.getPrice()));
    }

    public void buy(User user, String symbol, int qty) {
        Stock stock = market.get(symbol);

        if (stock != null) {
            double cost = stock.getPrice() * qty;

            if (user.getBalance() >= cost) {
                user.withdraw(cost);
                user.getPortfolio().buyStock(symbol, qty);
                System.out.println("Bought " + qty + " shares of " + symbol);
            } else {
                System.out.println("Insufficient balance!");
            }
        }
    }

    public void sell(User user, String symbol, int qty) {
        Stock stock = market.get(symbol);

        if (stock != null) {
            user.deposit(stock.getPrice() * qty);
            user.getPortfolio().sellStock(symbol, qty);
            System.out.println("Sold " + qty + " shares of " + symbol);
        }
    }

    public static void main(String[] args) {

        TradingPlatform platform = new TradingPlatform();

        platform.addStock(new Stock("AAPL", 180));
        platform.addStock(new Stock("TSLA", 250));

        User user = new User("John", 10000);

        platform.displayMarket();

        platform.buy(user, "AAPL", 10);
        platform.sell(user, "AAPL", 5);

        System.out.println("Balance: $" + user.getBalance());
        user.getPortfolio().displayPortfolio();
    }
}