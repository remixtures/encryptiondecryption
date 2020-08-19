package encryptdecrypt;

public class ShiftAlgorithm implements AlgorithmType {

    @Override
    public String encrypt(String message, int key) {

        StringBuilder result = new StringBuilder();
        for (char letter : message.toCharArray()) {
            if (String.valueOf(letter).matches("[a-z]")) {
                result.append((char) ((letter - 'a' + key) % 26 + 'a'));
            } else if (String.valueOf(letter).matches("[A-Z]")) {
                result.append((char) ((letter - 'A' + key) % 26 + 'A'));
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }

    @Override
    public String decrypt(String message, int key) {

        StringBuilder result = new StringBuilder();
        for (char letter : message.toCharArray()) {
            if (String.valueOf(letter).matches("[a-z]")) {
                result.append((char) ('z' - ('z' - letter + key) % 26));
            } else if (String.valueOf(letter).matches("[A-Z]")) {
                result.append((char) ('Z' - ('Z' - letter + key) % 26));
            } else {
                result.append(letter);
            }
        }
        return result.toString();
    }
}
