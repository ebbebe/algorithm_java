import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();
        int find_num = Integer.parseInt(br.readLine());
        int stack = 0;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == find_num){
                stack += 1;
            }
        }

        System.out.println(stack);

    }
}
