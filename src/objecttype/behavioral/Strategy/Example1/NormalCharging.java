package objecttype.behavioral.Strategy.Example1;

public class NormalCharging extends Charging{
    @Override
    public double charge(double money) {
        return money;
    }
}
