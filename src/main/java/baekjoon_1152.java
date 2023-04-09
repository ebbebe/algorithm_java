import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int count = input.length;
        for(int i = 0; i < input.length; i++){
            if(input[i].length() == 0){
                count -= 1;
            }
        }

        System.out.println(count);
    }
}
