import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int num = Integer.parseInt(str[0]);
        int min_num = Integer.parseInt(str[1]);

        String[] str_numbers = br.readLine().split(" ");
        int[] numbers = Arrays.stream(str_numbers).mapToInt(Integer::parseInt).toArray();
        int double_stack = 0;
        String result = "";

        for(int i = 0; i < numbers.length; i++){
            if(min_num > numbers[i] && double_stack == 0){
                result += numbers[i];
                double_stack += 1 ;
            }else if(min_num > numbers[i]){
                result += " " + numbers[i];
            }
        }

        System.out.println(result);
    }
}
