import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;

public class BlowFish {
    public static void main(String[] args) throws Exception{
        System.out.println("\n");
       KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
       keyGenerator.init(128);
       Key secretKey = keyGenerator.generateKey();
       Cipher cipherOut = Cipher.getInstance("Blowfish/CFB/NoPadding");
       cipherOut.init(Cipher.ENCRYPT_MODE, secretKey);
       //BASE64Encoder encoder = new BASE64Encoder();
       byte iv[] = cipherOut.getIV();
       Base64.getEncoder().encode(iv);
       if(iv != null){
           System.out.println("Initilisation vector of the Cipher: " +iv);
           System.out.println("\n");
       }
        FileInputStream fin = new FileInputStream("inputFile.txt");
        FileOutputStream fout = new FileOutputStream("outputFile.txt");
        CipherOutputStream cout = new CipherOutputStream(fout, cipherOut);
        byte[] buffer = new byte[64];
        int input;
        while((input = fin.read(buffer)) != -1){
            cout.write(buffer, 0, input);
        }
        fin.close();
        cout.close();
    }
}