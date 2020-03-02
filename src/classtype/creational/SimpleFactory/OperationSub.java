package classtype.creational.SimpleFactory;
//减法运算
public class OperationSub extends Operation {
    @Override
    public double getResult() {
        return get_numberA() - get_numberB();
    }
}
