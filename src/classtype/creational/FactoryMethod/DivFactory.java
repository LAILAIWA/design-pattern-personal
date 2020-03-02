package classtype.creational.FactoryMethod;

import classtype.creational.SimpleFactory.Operation;
import classtype.creational.SimpleFactory.OperationDiv;

public class DivFactory implements IFactory {
    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
