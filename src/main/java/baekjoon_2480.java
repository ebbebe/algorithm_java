import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int cubes[] = new int[3];

        cubes[0] = Integer.parseInt(input[0]);
        cubes[1] = Integer.parseInt(input[1]);
        cubes[2] = Integer.parseInt(input[2]);
        int result = 0;

        if(cubes[0] == cubes[1] && cubes[0] == cubes[2]){
             result = 10000 + (cubes[0] * 1000);
        }
        else if(cubes[0] == cubes[1] || cubes[0] == cubes[2]){
            result = 1000 + (cubes[0] * 100);
        }
        else if(cubes[1] == cubes[2]){
            result = 1000 + (cubes[1] * 100);
        }
        else{
            if(cubes[0] > cubes[1] && cubes[0] > cubes[2]){
                result = cubes[0] * 100;
            }
            else if(cubes[1] > cubes[0] && cubes[1] > cubes[2]){
                result = cubes[1] * 100;
            }
            else if(cubes[2] > cubes[0] && cubes[2] > cubes[1]){
                result = cubes[2] * 100;
            }
        }


        System.out.println(result);
    }
}