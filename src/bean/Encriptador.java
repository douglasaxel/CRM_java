package bean;

import java.util.Base64;

public class Encriptador {

    public static String encrypt(String data) {
        String encrypted = Base64.getEncoder().encodeToString(data.getBytes());
        return encrypted;
    }

    public static String decrypt(String data) {
        byte[] arrayDecrypted = Base64.getDecoder().decode(data);
        String decrypted = new String(arrayDecrypted);
        return decrypted;
    }
}
