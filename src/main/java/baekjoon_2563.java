import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] paper = new int[100][100];

        for(int i = 0; i < 100; i++) {
            Arrays.fill(paper[i], 0);
        }


        for (int i = 0; i < count; i++) {
            String[] str = br.readLine().split(" ");
            int x_1 = Integer.parseInt(str[0]);
            int y_1 = Integer.parseInt(str[1]);
            int x_2 = x_1 + 10;
            int y_2 = y_1 + 10;

            for (int j = y_1; j < y_2; j++) {
                for (int k = x_1; k < x_2; k++) {
                    int square = paper[j][k];
                    if(square == 0){
                        paper[j][k] = 1;
                    }
                }
            }
        }

        int stack = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                int square = paper[i][j];

                if(square == 1){
                    stack += 1;
                }
            }
        }
        System.out.println(stack);
    }
}
