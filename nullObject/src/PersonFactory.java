import java.time.LocalDate;

/**
 * [[ Descrição da classe aqui ]]
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class PersonFactory {

    public static Person getInstance(PersonType personType) {

        if (personType.equals(PersonType.JONH_DOE)) {
            Person p = new Person();
            p.setName("Jonh");
            p.setSurname("Doe");
            p.setBirthday(LocalDate.of(1994, 6, 16));

            return p;
        } else {
            return new PersonEmpty();
        }
    }
}
