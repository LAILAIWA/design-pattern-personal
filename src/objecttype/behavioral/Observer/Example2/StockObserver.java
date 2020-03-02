package objecttype.behavioral.Observer.Example2;

import objecttype.behavioral.Observer.Example1.Secretary;

public class StockObserver extends Observer {
    public StockObserver(String name, Subject sub) {
        super(name,sub);
    }

    public void update(){
        System.out.println(this.sub.getSecretaryAction() + this.name + " 关闭股票行情，继续工作！");
    }
}
