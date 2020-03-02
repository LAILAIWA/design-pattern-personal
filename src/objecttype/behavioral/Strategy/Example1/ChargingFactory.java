package objecttype.behavioral.Strategy.Example1;

public class ChargingFactory {
    public static Charging createCharging(String type){
        Charging charging = null;
        switch (type){
            case "正常收费":
                charging = new NormalCharging();
                break;
            case "满300返100":
                charging = new CashReturnCharging(300,100);
                break;
            case "八折":
                charging = new DiscountCharging(0.8);
                break;
        }
        return charging;
    }
}
