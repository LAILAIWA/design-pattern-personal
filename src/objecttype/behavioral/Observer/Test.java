package objecttype.behavioral.Observer;

import objecttype.behavioral.Observer.Example2.Boss;
import objecttype.behavioral.Observer.Example2.NBAObserver;
import objecttype.behavioral.Observer.Example2.StockObserver;

public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();

        StockObserver tongshi1 = new StockObserver("张三",boss);
        NBAObserver tongshi2 = new NBAObserver("李四",boss);

        boss.attach(tongshi1);
        boss.attach(tongshi2);

        boss.detach(tongshi1);

        boss.setSecretaryAction("老板回来了！");
        boss.notifyy();
    }
}
