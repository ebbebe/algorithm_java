import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] str = br.readLine().toCharArray();


        int rev_idx = str.length - 1;
        int isDrome = 1;

        for(int i = 0; i < str.length; i++){
            if(str[i] != str[rev_idx]){
                isDrome = 0;
            }
            rev_idx -= 1;
        }


        System.out.println(isDrome);
    }
}
