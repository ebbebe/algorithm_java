import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String x = br.readLine();
        String input = br.readLine();
        char[] chars = input.toCharArray();
        int result = 0;

        for(int i = 0; i < chars.length; i++){
            int num = Integer.parseInt(String.valueOf(chars[i]));
            result += num;
        }

        System.out.println(result);

    }
}
