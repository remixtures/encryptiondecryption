package encryptdecrypt.algorithms;

public class AlgorithmFactory {

    public CryptoType createAlgorithm(String type) {
        CryptoType algorithm;
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
