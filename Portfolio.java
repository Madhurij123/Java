import java.util.HashMap;
import java.util.Map;

public class Portfolio {
    private Map<String, Integer> holdings = new HashMap<>();

    public void buyStock(String symbol, int quantity) {
        holdings.put(symbol, holdings.getOrDefault(symbol, 0) + quantity);
    }

    public void sellStock(String symbol, int quantity) {
        if (holdings.containsKey(symbol)) {
            int current = holdings.get(symbol);
            if (current >= quantity) {
                holdings.put(symbol, current - quantity);
            }
        }
    }

    public void displayPortfolio() {
        System.out.println("Portfolio:");
        holdings.forEach((stock, qty) ->
                System.out.println(stock + " : " + qty + " shares"));
    }
}