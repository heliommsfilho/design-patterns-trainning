/**
 * Shows how State Pattern helps to change the application behavior based on state variation.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class EventReporter {

    private Reporter reporter;

    public void report() {
        System.out.println("Something occurred! Reporting...");
        this.reporter.report(this);
    }

    public EventReporter() {
        this.reporter = new ConsoleReporter();
    }

    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }
}
