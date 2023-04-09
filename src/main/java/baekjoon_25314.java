import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int count = (input/4) -1;
        String result;

        if(count == 0){
            result = "long int";
        }else{
            result = "long";
        }

        for(int i  = 0; i < count; i++){
            if(i != (count-1)) {
                result += " long";
            }else{
                result += " long int";
            }
        }

        System.out.println(result);
    }
}
