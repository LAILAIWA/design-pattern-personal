package objecttype.behavioral.Observer.Example3;


public class Boss extends Subject {
    private String action;

    @Override
    public void notifyy() {
        System.out.println("委托人通知老板来了");
        try {
            EventHandler handler = this.getEventHandler();
            handler.notifyy();
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    @Override
    public void addObserver(Object o, String methodName, Object... args) {
        System.out.println("委托人新增被通知人");
        try {
            EventHandler handler = this.getEventHandler();
            handler.addEvent(o,methodName,args);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
