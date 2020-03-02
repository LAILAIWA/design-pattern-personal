package objecttype.structural.Proxy;

import objecttype.structural.Proxy.Example1.Pursuit;
import objecttype.structural.Proxy.Example1.SchoolGirl;
import objecttype.structural.Proxy.Example2.Proxy;
import objecttype.structural.Proxy.Example2.PursuitImpl;

public class Test {
    public static void main(String[] args) {
        //追求者调用被追求者，增送各种礼物
        System.out.println("--------------追求者调用被追求者，增送各种礼物");
        SchoolGirl jiaojiao = new SchoolGirl();
        jiaojiao.setName("李娇娇");

        Pursuit zhuojiayi = new Pursuit(jiaojiao);
        zhuojiayi.giveDolls();
        zhuojiayi.giveFlowers();
        zhuojiayi.giveChocolate();

        //增加代理人
        //
        System.out.println("--------------增加代理人");
        PursuitImpl zhuojiayiNew = new PursuitImpl(jiaojiao);
        Proxy daili = new Proxy(zhuojiayiNew);
        daili.giveDolls();
        daili.giveFlowers();
        daili.giveChocolate();
    }
}
