import operator.Operator;

import java.util.Scanner;

/**
 * Defines the algorithm specifying how the operation should occur.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public abstract class AbstractOperation<O extends Operator> {

    final void startOperation() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double input1 = Double.parseDouble(sc.nextLine());

        System.out.print("Enter the second number: ");
        double input2 = Double.parseDouble(sc.nextLine());

        getOperator().operate(input1, input2);
    }
    abstract O getOperator();
}
