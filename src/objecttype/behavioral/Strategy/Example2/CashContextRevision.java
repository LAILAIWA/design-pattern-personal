package objecttype.behavioral.Strategy.Example2;

import objecttype.behavioral.Strategy.Example1.CashReturnCharging;
import objecttype.behavioral.Strategy.Example1.Charging;
import objecttype.behavioral.Strategy.Example1.DiscountCharging;
import objecttype.behavioral.Strategy.Example1.NormalCharging;

public class CashContextRevision {
    private Charging charging;

    public CashContextRevision(String type) {
        switch (type){
            case "正常收费":
                this.charging = new NormalCharging();
                break;
            case "满300返100":
                this.charging = new CashReturnCharging(300,100);
                break;
            case "八折":
                this.charging = new DiscountCharging(0.8);
                break;
        }
    }

    public double getResult(double money){
        return charging.charge(money);
    }
}
