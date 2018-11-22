import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.format.DateTimeFormatter;

/**
 * Creates a CSV from a Log
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class SaveToCSV extends SaveToFile{

    @Override
    public void writeToDisk(Log log, String logPath) {
        String csv = String.join(";",
                        log.getWhenHappened().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")),
                        log.getWhatHappened(), log.getLoggedUser(), log.getIp());

        try {
            Files.createFile(Paths.get(logPath));
            Files.write(Paths.get(logPath), csv.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
