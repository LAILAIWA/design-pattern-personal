package objecttype.structural.Proxy.Example2;

import objecttype.structural.Proxy.Example1.SchoolGirl;

public class Proxy implements IGiveGift {
    PursuitImpl gg;

    public Proxy(PursuitImpl gg) {
        this.gg = gg;
    }

    public void giveDolls(){
        gg.giveDolls();
    }

    public void giveFlowers(){
        gg.giveFlowers();
    }

    public void giveChocolate(){
        gg.giveChocolate();
    }

}
