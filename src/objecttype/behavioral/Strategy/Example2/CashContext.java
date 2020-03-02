package objecttype.behavioral.Strategy.Example2;

import objecttype.behavioral.Strategy.Example1.Charging;

public class CashContext {
    private Charging charging;

    public CashContext(Charging charging) {
        this.charging = charging;
    }

    public double getResult(double money){
        return charging.charge(money);
    }
}
