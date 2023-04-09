import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String star = "";
            for(int j = 0; j < i+1; j++){
                star += "*";
            }
            System.out.println(star);
        }
    }
}
