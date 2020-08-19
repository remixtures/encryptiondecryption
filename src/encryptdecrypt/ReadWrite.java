package encryptdecrypt;

import encryptdecrypt.algorithms.CryptoType;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ReadWrite {

    public static String readFromFile(Scanner input, CryptoType cryptoType, String mode,
                                      int key, String data, String inputFileName,
                                      String result) {

        if (data.isBlank() && inputFileName.isBlank()) {
            data = input.nextLine();
            result = cryptoType.selectEncryptionDecryption(mode, data, key);
        } else if (!inputFileName.isBlank()) {
            try {
                data = Files.readString(Paths.get(inputFileName));
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            result = cryptoType.selectEncryptionDecryption(mode, data, key);
        }
        return result;
    }

    public static void writeToFile(String outputFileName, String result) {

        if (outputFileName.isEmpty()) {
            System.out.println(result);
        } else {
            try (FileWriter writer = new FileWriter(outputFileName);
                 BufferedWriter bfWriter = new BufferedWriter(writer)) {
                bfWriter.write(result);
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
