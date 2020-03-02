package objecttype.behavioral.Observer.Example1;

public class Main {
    public static void main(String[] args) {
        //模拟前台通知摸鱼职员躲避老板审查工作

        //前台小姐
        Secretary qiantai = new Secretary();
        //看股票的同事
        StockObserver tongshi1 = new StockObserver("张三",qiantai);
        StockObserver tongshi2 = new StockObserver("李四",qiantai);

        //前台登记两名同事
        qiantai.attach(tongshi1);
        qiantai.attach(tongshi2);

        //发现老板回来
        qiantai.setSecretaryAction("老板回来了！");
        //发送通知
        qiantai.notifyy();

        //此结构下前台和同事两类相互耦合，难以扩展
    }
}
