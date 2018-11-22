import operator.DivisionOperator;
import operator.ProductOperator;
import operator.SubtractOperator;
import operator.SumOperator;

/**
 * Shows how to use Factory Method to provide the correct dependency that a class needs.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Main {

    public static void main(String[] args) {
        AbstractOperation<SumOperator>      operationSum      = new SumClass();
        AbstractOperation<SubtractOperator> operationSubtract = new SubstractClass();
        AbstractOperation<ProductOperator>  operationProduct  = new ProductClass();
        AbstractOperation<DivisionOperator> operationDivision = new DivisioClass();

        operationSum.startOperation();
        operationSubtract.startOperation();
        operationProduct.startOperation();
        operationDivision.startOperation();
    }


}

class SumClass extends AbstractOperation<SumOperator> {

    @Override
    SumOperator getOperator() {
        return new SumOperator();
    }
}

class SubstractClass extends AbstractOperation<SubtractOperator> {

    @Override
    SubtractOperator getOperator() {
        return new SubtractOperator();
    }
}

class ProductClass extends AbstractOperation<ProductOperator> {

    @Override
    ProductOperator getOperator() {
        return new ProductOperator();
    }
}

class DivisioClass extends AbstractOperation<DivisionOperator> {

    @Override
    DivisionOperator getOperator() {
        return new DivisionOperator();
    }
}
