// Write a Java program to perform encryption and decryption using the
// Caeser Cipher

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ceaserCipherAlgirithm {
    static Scanner input = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Enter any String: ");
        String str = br.readLine();
        System.out.println("Enter the KEY: ");
        int key = input.nextInt();
        String encrypted = encrypt(str, key);
        System.out.println("Encrypted Text is: " + encrypted);
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Choose 1 to Decrypt and any other number to close the Program:");
        int num = 0;
        num = input.nextInt();
        if(num == 1){
            System.out.println("Enter the Key");
            int key2 = input.nextInt();
            if(key == key2){
                String decrypted = decrypt(encrypted, key);
                System.out.println("Decrypted Text is: " +decrypted);
            }else{
                System.out.println("WRONG key! Thank you!");
            }  
        }else{
            System.out.println("Thank for using out Program");
        }  
    }

    public static String encrypt(String str, int key){
        String encrypted = "";
        for (int i=0; i<str.length(); i++) {
            int c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                c = c + (key%26);
                if(c > 'Z'){
                    c = c - 26;
                }
            }
            else if(Character.isLowerCase(c)){
                c = c + (key%26);
                if(c > 'z'){
                    c = c - 26;
                }
            }
            encrypted += (char) c;
        }
        return encrypted;
    }


    public static String decrypt(String str, int key){
        String decrypted = "";
        for(int i=0; i<str.length(); i++){
            int c = str.charAt(i);
            if(Character.isUpperCase(c)){
                c = c - (key%26);
                if(c < 'A'){
                    c = c + 26;
                }
            }
            else if(Character.isLowerCase(c)){
                c = c - (key%26);
                if(c < 'a'){
                    c = c + 26;
                }
            }
            decrypted += (char) c;
        }
        return decrypted;
    }
}