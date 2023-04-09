import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++){
            String str = br.readLine();

            char[] chars = str.toCharArray();
            int length = chars.length;

            String result = Character.toString(chars[0]) + Character.toString(chars[length-1]);
            System.out.println(result);
        }
    }
}
