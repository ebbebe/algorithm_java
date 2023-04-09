import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        char[] chars_1 = input[0].toCharArray();
        char[] chars_2 = input[1].toCharArray();

        String rev_num1 = "";
        String rev_num2 = "";
        for(int i = 3; i > 0; i--){
            rev_num1 += chars_1[i-1];
            rev_num2 += chars_2[i-1];
        }

        int num1 = Integer.parseInt(rev_num1);
        int num2 = Integer.parseInt(rev_num2);

        int result = 0;
        if(num1 > num2){
            result = num1;
        }else{
            result = num2;
        }


        System.out.println(result);
    }
}
