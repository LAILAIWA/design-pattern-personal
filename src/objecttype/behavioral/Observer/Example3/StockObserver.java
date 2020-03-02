package objecttype.behavioral.Observer.Example3;

import objecttype.behavioral.Observer.Example2.Observer;
import objecttype.behavioral.Observer.Example2.Subject;

public class StockObserver {
    private String name;

    public StockObserver(String name) {
        System.out.println("我是" + name + "，开始看股票行情");
        this.name = name;
    }

    public void closeStockMarket(){
        System.out.println(this.name + " 关闭股票行情，继续工作！");
    }
}
