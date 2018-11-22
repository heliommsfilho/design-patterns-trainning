import java.time.LocalDateTime;

/**
 * [[ Descrição da classe aqui ]]
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class Main {

    public static void main(String[] args) {
        SaveToFile save = new SaveToCSV();
        save.readAndSave();

        save = new SaveToXML();
        save.readAndSave();
    }
}
