package objecttype.behavioral.Observer.Example3;

/**
 * 客户端代码
 */
public class Main {
    public static void main(String[] args) {
        Subject s = new Boss();
        NBAObserver nba = new NBAObserver("X");
        StockObserver stock = new StockObserver("Y");
        s.addObserver(nba,"closeNBADirectSeeding");
        s.addObserver(stock,"closeStockMarket");
        s.notifyy();
    }
}
