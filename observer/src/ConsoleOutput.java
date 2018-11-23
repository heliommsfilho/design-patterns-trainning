/**
 * Shows how Observer Pattern helps to solve problems related to notify objects interested in some particular event.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class ConsoleOutput implements LoteryObserver {

    @Override
    public void numberSorted(int number) {
        System.out.println("A new number was sorted: " + number);
    }
}
