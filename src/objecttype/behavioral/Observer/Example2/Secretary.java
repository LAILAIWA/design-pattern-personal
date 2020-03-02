package objecttype.behavioral.Observer.Example2;

import objecttype.behavioral.Observer.Example1.StockObserver;

import java.util.ArrayList;
import java.util.List;

//前台秘书
public class Secretary {
    //针对抽象编程，减少了和具体类的耦合
    //同时列表
    private List<Observer> observers = new ArrayList<>();
    private String action;

    //增加
    public void attach(Observer observer){
        observers.add(observer);
    }

    //减少
    public void detach(Observer observer){
        observers.remove(observer);
    }

    //通知
    public void notifyy(){
        for (Observer observer : observers){
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
