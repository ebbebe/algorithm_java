import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[][] N_arr = new int[N][M];
        int[][] M_arr = new int[N][M];
        int[][] result_arr = new int[N][M];

        for (int i = 0; i < N; i++) { // N_arr 입력 받기
            String[] strings = br.readLine().split(" ");
            N_arr[i] = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++) { // M_arr 입력 받기
            String[] strings = br.readLine().split(" ");
            M_arr[i] = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
        }

        for (int i = 0; i < N; i++) { // N_arr + M_arr
            for (int j = 0; j < M; j++) {
                result_arr[i][j] = N_arr[i][j] + M_arr[i][j];
            }
        }

        for (int i = 0; i < N; i++) { // 결과 출력
            String result = "";
            for (int j = 0; j < M; j++) {
                if(j == 0){
                    result += result_arr[i][j];
                }else{
                    result += " " + result_arr[i][j];
                }
            }
            System.out.println(result);
        }
    }
}
