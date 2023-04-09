import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        char[] str_array = input.toCharArray();

        int num = Integer.parseInt(br.readLine());

        System.out.println(str_array[num-1]);
    }
}
