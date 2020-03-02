package objecttype.behavioral.Strategy.Example1;

public class CashReturnCharging extends Charging {
    private double condition;//返利条件
    private double returnValue;//返利金额

    public CashReturnCharging(double condition, double returnValue) {
        this.condition = condition;
        this.returnValue = returnValue;
    }

    @Override
    public double charge(double money) {
        if(money >= condition)
            return money - Math.floor(money / condition) * returnValue;
        else
            return money;
    }
}
