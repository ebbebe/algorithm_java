import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] pieces = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        int king = pieces[0];
        int queen = pieces[1];
        int look = pieces[2];
        int bishop = pieces[3];
        int night = pieces[4];
        int phone = pieces[5];

        int[] results = new int[pieces.length];

        cal_count(results, king, 1, 0);
        cal_count(results, queen, 1, 1);
        cal_count(results, look, 2, 2);
        cal_count(results, bishop, 2, 3);
        cal_count(results, night, 2, 4);
        cal_count(results, phone, 8, 5);


        String result = "";
        for(int i = 0; i < results.length; i++){
            if(i == 0){
                result += results[i];
            }else{
                result += " " + results[i];
            }
        }

        System.out.println(result);

    }

    private static void cal_count(int[] results, int piece, int count, int index) {

        if(piece == count){
            results[index] = 0;
        }
        else if(piece >= 0){
            int min = piece - count;
            results[index] = -min;
        }
        else{
            int plus = count - piece;
            results[index] = plus;
        }
    }
}
