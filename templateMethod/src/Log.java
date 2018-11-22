import java.time.LocalDateTime;

/**
 * A fiction log that must be saved to disk.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Log {

    private LocalDateTime whenHappened;
    private String whatHappened;
    private String loggedUser;
    private String ip;

    public LocalDateTime getWhenHappened() {
        return whenHappened;
    }

    public void setWhenHappened(LocalDateTime whenHappened) {
        this.whenHappened = whenHappened;
    }

    public String getWhatHappened() {
        return whatHappened;
    }

    public void setWhatHappened(String whatHappened) {
        this.whatHappened = whatHappened;
    }

    public String getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(String loggedUser) {
        this.loggedUser = loggedUser;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
