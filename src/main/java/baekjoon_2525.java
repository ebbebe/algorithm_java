import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int delay_minute = Integer.parseInt(br.readLine());
        int input_hour = Integer.parseInt(input[0]);
        int input_minute = Integer.parseInt(input[1]);

        int output_hour = 0;
        int output_minute = 0;


        int add_hour = 0;
        int sum_minute = input_minute + delay_minute;

        if(sum_minute >= 60){
            while(sum_minute >= 60){
                add_hour += 1;
                sum_minute -= 60;
            }
            output_minute = sum_minute;

            int sum_hour = input_hour + add_hour;
            while(sum_hour >= 24){
                sum_hour -= 24;
            }
            output_hour = sum_hour;


        }else{
            output_hour = input_hour;
            output_minute = input_minute + delay_minute;
        }


        System.out.println(output_hour + " " + output_minute);
    }
}
