package classtype.creational.FactoryMethod;

import classtype.creational.SimpleFactory.Operation;
import classtype.creational.SimpleFactory.OperationSub;

public class SubFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationSub();
    }
}
