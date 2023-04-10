import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String[] arr_alphabet = new String[8];

        arr_alphabet[0] = "c=";
        arr_alphabet[1] = "c-";
        arr_alphabet[2] = "dz=";
        arr_alphabet[3] = "d-";
        arr_alphabet[4] = "lj";
        arr_alphabet[5] = "nj";
        arr_alphabet[6] = "s=";
        arr_alphabet[7] = "z=";

        for (int i = 0; i < arr_alphabet.length; i++) {
            str = str.replaceAll(arr_alphabet[i], ".");
        }

        System.out.println(str.length());

    }
}
