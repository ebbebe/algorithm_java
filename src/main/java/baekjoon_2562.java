import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[9];

        for(int i = 0; i < 9; i++){
            numbers[i] = Integer.parseInt(br.readLine());
        }

        int max = numbers[0];
        int index = 0;

        for(int i = 0; i < 9; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(max < numbers[j]){
                    max = numbers[j];
                    index = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(index+1);
    }
}
