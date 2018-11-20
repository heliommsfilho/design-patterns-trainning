import encryptor.Encryptor;
import encryptor.impl.MD5Encryptor;
import encryptor.impl.SHA1Encryptor;
import encryptor.impl.SHA256Encryptor;
import encryptor.impl.SHA512Encryptor;

import javax.xml.bind.DatatypeConverter;

/**
 * Shows how Strategy pattern helps to create algorithms with interchangeable parts implementing an application which
 * encrypt a String passed by parameter in many algorithms.
 *
 * @author Hélio Márcio Matos dos Santos Filho
 * @version 1.0
 * @since 0.0.1-SNAPSHOT
 */
public class EncryptorApp {

    public static void main(String[] args) {

        for(String s : args) {
            encryptAllAlgoriths(s);
        }
    }

    /* Interchangeable implementations */
    private static void encryptAllAlgoriths(String s) {
        Encryptor encryptor;

        encryptor = new MD5Encryptor();
        System.out.println(s + " ---> " + convertHexString(encryptor.encrypt(s)));

        encryptor = new SHA1Encryptor();
        System.out.println(s + " ---> " + convertHexString(encryptor.encrypt(s)));

        encryptor = new SHA256Encryptor();
        System.out.println(s + " ---> " + convertHexString(encryptor.encrypt(s)));

        encryptor = new SHA512Encryptor();
        System.out.println(s + " ---> " + convertHexString(encryptor.encrypt(s)) + "\n");
    }

    private static String convertHexString(byte[] bytes) {
        return DatatypeConverter.printHexBinary(bytes).toUpperCase();
    }
}
