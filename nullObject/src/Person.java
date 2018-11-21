import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Basic Person info
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Person {

    private String name;
    private String surname;
    private LocalDate birthday;

    public int calculateAge() {
        long daysBetween = ChronoUnit.DAYS.between(birthday, LocalDate.now());
        return (int) Math.ceil(daysBetween / 365);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        if (birthday != null) {
            this.birthday = birthday;
        } else {
            this.birthday = LocalDate.now();
        }
    }
}
