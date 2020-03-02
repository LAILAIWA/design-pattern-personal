package objecttype.behavioral.Observer.Example3;

public class NBAObserver {
    private String name;

    public NBAObserver(String name) {
        System.out.println("我是" + name + "，开始看NBA直播");
        this.name = name;
    }

    public void closeNBADirectSeeding(){
        System.out.println(this.name + " 关闭NBA直播，继续工作！");
    }
}
