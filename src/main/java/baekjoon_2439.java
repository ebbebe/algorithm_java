import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for(int i = 1; i < count+1; i++){
            int space_count = count - i;
            String space = "";
            String star = "";

            for(int j = 0; j < space_count; j++){
                space += " ";
            }

            for(int j = 0; j < i; j++){
                star += "*";
            }

            System.out.println(space+star);
        }
    }
}

