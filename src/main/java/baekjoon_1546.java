import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] score_list = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();


        double max = score_list[0];
        for(int i = 0; i < cnt; i++){
            if(max < score_list[i]){
                max = score_list[i];
            }
        }


        double[] new_score_list = new double[cnt];
        double ab_score = 0;

        for(int i = 0; i < cnt; i++){
            new_score_list[i] = score_list[i]/max*100;
            ab_score += new_score_list[i];
        }
        double result = ab_score / cnt;

        System.out.println(result);
    }
}
