/**
 * Shows how State Pattern helps to change the application behavior based on state variation.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class ConsoleReporter implements Reporter {

    @Override
    public void report(EventReporter er) {
        System.out.println("Action reported to console!");
        er.setReporter(new FileReporter());
    }
}
