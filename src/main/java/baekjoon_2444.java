import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        for(int i = 1; i < number; i++){
            int space_count = number - i;
            int star_count = (2 * i) - 1;
            String result = "";

            for(int j = 0; j < space_count; j++){
                result += " ";
            }

            for(int j = 0; j < star_count; j++){
                result += "*";
            }
            System.out.println(result);
        }

        for(int i = number; i > 0; i--){
            int space_count = number - i;
            int star_count = (2 * i) - 1;
            String result = "";

            for(int j = 0; j < space_count; j++){
                result += " ";
            }

            for(int j = 0; j < star_count; j++){
                result += "*";
            }
            System.out.println(result);

        }
    }
}
