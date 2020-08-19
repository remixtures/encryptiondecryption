package encryptdecrypt;

import encryptdecrypt.algorithms.AlgorithmType;
import encryptdecrypt.algorithms.ShiftAlgorithm;
import encryptdecrypt.algorithms.UnicodeAlgorithm;

public class CryptoFactory {

    AlgorithmType createAlgorithm(String type) {
        AlgorithmType algorithm;
        switch (type) {
            case "unicode" :
                algorithm = new UnicodeAlgorithm();
                break;
            case "shift":
                algorithm = new ShiftAlgorithm();
                break;
            default:
                throw new UnsupportedOperationException("Sorry. Cannot handle the algorithm type " + type + ".");
        }
        return algorithm;
    }
}
