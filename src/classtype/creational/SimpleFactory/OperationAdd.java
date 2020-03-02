package classtype.creational.SimpleFactory;
//加法运算
public class OperationAdd extends Operation {

    @Override
    public double getResult() {
        return get_numberA() + get_numberB();
    }
}
