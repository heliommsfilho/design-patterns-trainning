package encryptor;

/**
 * Define the contract to an encryptor algorithm.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public interface Encryptor {

    byte[] encrypt(String rawString);
}
