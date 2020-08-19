package encryptdecrypt.algorithms;

public interface CryptoType {

    default String selectEncryptionDecryption(String mode, String message, int key) {
        String result = "";
        if (mode ==  null || mode.equals("enc")) {
            result = encrypt(message, key);
        } else if (mode.equals("dec")) {
            result = decrypt(message, key);
        }
        return result;
    }

    String encrypt(String message, int key);
    String decrypt(String message, int key);
}
