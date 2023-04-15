import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[][] black_board = new String [5][15];

        for (int i = 0; i < 5; i++) {
            char[] strings = br.readLine().toCharArray();

            for (int j = 0; j < strings.length; j++) {
                black_board[i][j] = Character.toString(strings[j]);
            }
        }





        String result = "";
        // 반복문 15번 돌리기
        // 만약 들어온 원소값이 전부 공백이라면 반복문 중단
        for (int i = 0; i < 15; i++) {

            for (int j = 0; j < 5; j++) {
                if(black_board[j][i] != null){
                    result += black_board[j][i];
                }

            }
        }
        System.out.println(result);


    }
}
