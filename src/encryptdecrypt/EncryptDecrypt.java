package encryptdecrypt;

import encryptdecrypt.algorithms.AlgorithmFactory;
import encryptdecrypt.algorithms.CryptoType;

import java.util.Scanner;

public class EncryptDecrypt {

    private final Scanner input = new Scanner(System.in);
    private String mode = "enc";
    private int key = 0;
    private String data = "";
    private String inputFileName = "";
    private String outputFileName = "";
    private String alg = "";
    private String result = "";

    public void processingInput(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            if ("-mode".equals(arg)) {
                mode = args[++i];
            } else if ("-key".equals(arg)) {
                key = Integer.parseInt(args[++i]);
            } else if ("-data".equals(arg)) {
                data = args[++i];
            } else if ("-in".equals(arg)) {
                inputFileName = args[++i];
            } else if ("-out".equals(arg)) {
                outputFileName = args[++i];
            } else if ("-alg".equals(arg)) {
                alg = args[++i];
            }
        }
    }

    public void start() {
        CryptoType cryptoType = new AlgorithmFactory().createAlgorithm(alg);
        result = ReadWrite.readFromFile(input, cryptoType, mode, key, data, inputFileName, result);
        ReadWrite.writeToFile(outputFileName, result);
    }
}
