import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        long plus = Integer.parseInt(str[0]);
        long minus = Integer.parseInt(str[1]);
        long goal = Integer.parseInt(str[2]);



        long distance_travelled = plus - minus;
        long result = goal / distance_travelled;
        long nam = goal % distance_travelled;
        // 나머지가 minus 변수보다 클 때 + 1
         if(nam > 0){
             result += 1;
         }else{
             result -= 1;
         }
        // 나머지가 있다.
        // + 1
        // 나머지가 0이다.
        // - 1



        System.out.println("나머지: " + nam);
        System.out.println("테스트: " + (result-1));
        //999999901
        //999999998

    }
}
