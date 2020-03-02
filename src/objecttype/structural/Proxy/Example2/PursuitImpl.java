package objecttype.structural.Proxy.Example2;

import objecttype.structural.Proxy.Example1.SchoolGirl;

public class PursuitImpl implements IGiveGift {
    SchoolGirl mm;

    public PursuitImpl(SchoolGirl mm) {
        this.mm = mm;
    }

    public void giveDolls(){
        System.out.println(mm.getName() + "送你洋娃娃");
    }

    public void giveFlowers(){
        System.out.println(mm.getName() + "送你鲜花");
    }

    public void giveChocolate(){
        System.out.println(mm.getName() + "送你巧克力");
    }

}
