package objecttype.behavioral.Observer.Example1;

import java.util.ArrayList;
import java.util.List;
//前台秘书
public class Secretary {
    //同时列表
    private List<StockObserver> observers = new ArrayList<>();
    private String action;

    //增加
    public void attach(StockObserver observer){
        observers.add(observer);
    }

    //通知
    public void notifyy(){
        for (StockObserver observer : observers){
            observer.update();
        }
    }

    public String getSecretaryAction(){
        return action;
    }
    public void setSecretaryAction(String value){
        action = value;
    }
}
