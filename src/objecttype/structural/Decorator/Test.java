package objecttype.structural.Decorator;

import objecttype.structural.Decorator.Example1.*;
import objecttype.structural.Decorator.Example2.*;

public class Test {
    public static void main(String[] args) {
        //换装系统
        Person zs = new Person("张三");
        System.out.println("-------------------第一种装扮");
        Finery dtx = new TShirtsFinery();
        Finery kk = new BigTrouserFinery();
        Finery ydx = new SneakerFinery();
        dtx.show();
        kk.show();
        ydx.show();
        zs.show();
        System.out.println("-------------------第二种装扮");
        Finery xz = new SuitFinery();
        Finery ld = new TieFinery();
        Finery px = new LeatherShoesFinery();
        xz.show();
        ld.show();
        px.show();
        zs.show();

        //存在问题有：每次都只能单独的穿一件衣服

        //装饰模式
        System.out.println("-------------------第一种装扮");
        TShirtsDecorator dtxDecorator = new TShirtsDecorator();
        BigTrouserDecorator kkDecorator = new BigTrouserDecorator();
        SneakerDecorator ydxDecorator = new SneakerDecorator();

        dtxDecorator.setComponent(zs);
        kkDecorator.setComponent(dtxDecorator);
        ydxDecorator.setComponent(kkDecorator);
        ydxDecorator.show();

        System.out.println("-------------------第二种装扮");
        SuitDecorator xzDecorator = new SuitDecorator();
        TieDecorator ldDecorator = new TieDecorator();
        LeatherShoesDecorator pxDecorator = new LeatherShoesDecorator();

        xzDecorator.setComponent(zs);
        ldDecorator.setComponent(xzDecorator);
        pxDecorator.setComponent(ldDecorator);
        pxDecorator.show();
    }
}
