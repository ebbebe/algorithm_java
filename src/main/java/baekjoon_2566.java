import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        for (int i = 0; i < 9; i++) { // 9 * 9 배열 입력
            String[] strings = br.readLine().split(" ");
            arr[i] = Arrays.asList(strings).stream().mapToInt(Integer::parseInt).toArray();
        }


        int max = arr[0][0]; // 최대값
        int i_index = 0; // 최대값 인덱스 1
        int j_index = 0; // 최대값 인덱스 2
        
        for (int i = 0; i < 9; i++) { // 최대값 비교
            for (int j = 0; j < 9; j++) {
                if(max < arr[i][j]){
                    max = arr[i][j];
                    i_index = i;
                    j_index = j;
                }
            }
        }


        System.out.println(max);
        System.out.println((i_index + 1) + " " + (j_index + 1));

    }
}
