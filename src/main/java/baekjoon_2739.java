import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        for(int i = 1; i < 10; i++){
            int ouput = input * i;
            System.out.println(input + " * " + i + " = " + ouput);
        }
    }
}