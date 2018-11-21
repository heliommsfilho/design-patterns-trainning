import java.time.format.DateTimeFormatter;

/**
 * Shows how the Null Object pattern can help to avoid null checks.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class PersonInfoApp {

    public static void main(String[] args) {
        Person jonhDoe = PersonFactory.getInstance(PersonType.JONH_DOE);
        Person none = PersonFactory.getInstance(PersonType.NONE);

        System.out.printf("Name: %s\nSurname: %s\nBirthday: %s\nAge: %d\n\n",
            jonhDoe.getName(),
            jonhDoe.getSurname(),
            jonhDoe.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            jonhDoe.calculateAge());

        System.out.printf("Name: %s\nSurname: %s\nBirthday: %s\nAge: %d\n\n",
            none.getName(),
            none.getSurname(),
            none.getBirthday().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
            none.calculateAge());
    }
}
