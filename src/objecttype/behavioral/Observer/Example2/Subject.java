package objecttype.behavioral.Observer.Example2;
//通知者接口
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyy();
    String getSecretaryAction();
    void setSecretaryAction(String value);
}
