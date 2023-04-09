import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input_num = Integer.parseInt(br.readLine());

        for(int i = 0; i < input_num; i++){
            String[] input = br.readLine().split(" ");
            int repeat_count = Integer.parseInt(input[0]);
            char[] test_case = input[1].toCharArray();
            String result = "";

            for(int j = 0; j < test_case.length;  j++){
                for(int k = 0; k < repeat_count; k++){
                    result += test_case[j];
                }
            }

            System.out.println(result);
        }



    }
}
