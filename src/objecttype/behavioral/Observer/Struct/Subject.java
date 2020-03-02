package objecttype.behavioral.Observer.Struct;

import java.util.ArrayList;
import java.util.List;
/**
 * 主题，或抽象通知者
 * 一般用一个抽象类或一个接口实现。
 * 它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以有任何数量的观察者。
 * 抽象主题提供一个接口
 */
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

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
}
