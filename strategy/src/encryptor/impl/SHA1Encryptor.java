package encryptor.impl;

import encryptor.Encryptor;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Encrypts a String using the SHA-1 algorithm.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class SHA1Encryptor implements Encryptor {

    private MessageDigest algorithm;

    public SHA1Encryptor() {

        try {
            this.algorithm = MessageDigest.getInstance("SHA-1");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] encrypt(String rawString) {
        return algorithm.digest(rawString.getBytes());
    }
}
