package objecttype.behavioral.Observer.Example2;

import objecttype.behavioral.Observer.Example1.Secretary;

public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject sub) {
        super(name,sub);
    }

    public void update(){
        System.out.println(this.sub.getSecretaryAction() + this.name + " 关闭NBA直播，继续工作！");
    }
}
