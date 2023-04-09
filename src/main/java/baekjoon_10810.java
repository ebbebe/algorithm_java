import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int basket_num = Integer.parseInt(str[0]);
        int count = Integer.parseInt(str[1]);
        int[] basket = new int[basket_num];
        String result = "";


        for(int i = 0; i < count; i++){
            String[] s = br.readLine().split(" ");
            int[] ints = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            int index_start = ints[0] - 1;
            int index_end = ints[1] - 1;
            int ball = ints[2];

            for(int j = index_start; j <= index_end; j++){
                basket[j] = ball;
            }


        }

        for(int i = 0; i < basket_num; i++){
            if(i == 0){
                result += basket[i];
            }else{
                result += " " + basket[i];
            }
        }

        System.out.println(result);

    }
}
