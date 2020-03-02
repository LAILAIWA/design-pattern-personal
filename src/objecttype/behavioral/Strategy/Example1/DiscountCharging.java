package objecttype.behavioral.Strategy.Example1;

public class DiscountCharging extends Charging {
    private double rebate;

    public DiscountCharging(double rebate) {
        this.rebate = rebate;
    }

    @Override
    public double charge(double money) {
        return money * rebate;
    }
}
