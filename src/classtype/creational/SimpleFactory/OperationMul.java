package classtype.creational.SimpleFactory;
//乘法运算
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        return get_numberA() * get_numberB();
    }
}
