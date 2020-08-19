package encryptdecrypt.algorithms;

public class UnicodeAlgorithm implements AlgorithmType {

    @Override
    public String encrypt(String message, int key) {
        StringBuilder result = new StringBuilder(message.length());
        for (char c : message.toCharArray()) {
            result.append((char) (c + key));
        }
        return result.toString();
    }

    @Override
    public String decrypt(String message, int key) {
        StringBuilder result = new StringBuilder(message.length());
        for (char c : message.toCharArray()) {
            result.append((char) (c - key));
        }
        return result.toString();
    }
}
