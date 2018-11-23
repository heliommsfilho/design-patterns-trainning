/**
 * Shows how State Pattern helps to change the application behavior based on state variation.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Main {

    public static void main(String[] args) {
        EventReporter eventReporter = new EventReporter();

        eventReporter.report();
        eventReporter.report();
        eventReporter.report();
    }
}
