package encryptor.impl;

import encryptor.Encryptor;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Encrypts a String using the MD5 algorithm.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class MD5Encryptor implements Encryptor {

    private MessageDigest algorithm;

    public MD5Encryptor() {

        try {
            this.algorithm = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    @Override
    public byte[] encrypt(String rawString) {
        return algorithm.digest(rawString.getBytes());
    }
}
