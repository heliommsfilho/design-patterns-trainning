import java.time.LocalDate;

/**
 * Represents a null Person
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class PersonEmpty extends Person {

    @Override
    public int calculateAge() {
        return 0;
    }

    @Override
    public String getName() {
        return "No name provided";
    }

    @Override
    public String getSurname() {
        return "No surname provided";
    }

    @Override
    public LocalDate getBirthday() {
        return LocalDate.MIN;
    }
}
