import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chars = str.toCharArray();
        char[] alpha = new char[26];
        int[] check = new int[26];
        alpha[0] = 'a';
        alpha[1] = 'b';
        alpha[2] = 'c';
        alpha[3] = 'd';
        alpha[4] = 'e';
        alpha[5] = 'f';
        alpha[6] = 'g';
        alpha[7] = 'h';
        alpha[8] = 'i';
        alpha[9] = 'j';
        alpha[10] = 'k';
        alpha[11] = 'l';
        alpha[12] = 'm';
        alpha[13] = 'n';
        alpha[14] = 'o';
        alpha[15] = 'p';
        alpha[16] = 'q';
        alpha[17] = 'r';
        alpha[18] = 's';
        alpha[19] = 't';
        alpha[20] = 'u';
        alpha[21] = 'v';
        alpha[22] = 'w';
        alpha[23] = 'x';
        alpha[24] = 'y';
        alpha[25] = 'z';

        for(int i = 0; i < check.length; i++){
            check[i] = -1;
        }

        for(int i = 0; i < chars.length; i++){
            for(int j = 0; j < alpha.length; j++){
                if(chars[i] == alpha[j] && (check[j] == -1)){
                    check[j] = i;
                }
            }
        }

        String result = "";
        for(int i = 0; i < check.length; i++){
            if(i == 0){
                result += check[i];
            }else{
                result += " " + check[i];
            }

        }
        System.out.println(result);
    }
}
