package classtype.creational.SimpleFactory;
//除法运算
public class OperationDiv extends Operation {
    @Override
    public double getResult() {
        if(get_numberB() == 0)
            throw new RuntimeException("除数禁止为0");
        return get_numberA() / get_numberB();
    }
}
