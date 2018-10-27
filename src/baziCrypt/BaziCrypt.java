package baziCrypt;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BaziCrypt {
    /**
     * Variables for Exercise 01
     **/
    private static final String BAZI_CRYPT_FILE_ONE = "assets/baziCrypt/n01.txt.enc";
    private static final String BAZI_CRYPT_FILE_TWO = "assets/baziCrypt/n02.txt.enc";
    private static final String BAZI_CRYPT_FILE_THREE = "assets/baziCrypt/n03.txt.enc";

    private static byte[][] baziFiles;


    public static void decryptBaziCryptFiles() {
        readInBaziCryptFiles();
        getEncryptionKeyFromPadding();
    }

    private static void getEncryptionKeyFromPadding() {
        List<Byte> keyFileOne = new ArrayList<>();
    }

    private static void readInBaziCryptFiles() {
        baziFiles = new byte[3][];
        try {
            baziFiles[0] = Files.readAllBytes(Paths.get(BAZI_CRYPT_FILE_ONE));
            baziFiles[1] = Files.readAllBytes(Paths.get(BAZI_CRYPT_FILE_TWO));
            baziFiles[2] = Files.readAllBytes(Paths.get(BAZI_CRYPT_FILE_THREE));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
