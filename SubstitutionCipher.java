import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SubstitutionCipher {
    static Scanner input = new Scanner(System.in);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String a = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        String b = "ZzYyXxWwVvUuTtSsRrQqPpOoNnMmLlKkJjIiHhGgFfEeDdCcBbAa";
        System.out.println("Enter any string: ");
        String str = br.readLine();
        String decrypt = "";

        char c;
        int j = 0;
        for (int i = 0; i < str.length(); i++ ) {
            c = str.charAt(i);
            j = a.indexOf(c);
            decrypt = decrypt+b.charAt(j);
        }
        
        System.out.println("The encrypted data is: " +decrypt);
    }
}