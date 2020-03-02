package classtype.creational.FactoryMethod;

import classtype.creational.SimpleFactory.Operation;
import classtype.creational.SimpleFactory.OperationMul;

public class MulFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationMul();
    }
}
