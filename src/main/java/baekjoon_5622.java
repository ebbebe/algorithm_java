import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] chars = br.readLine().toCharArray();

        int[] numbers = new int[chars.length];

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == 'A' || chars[i] == 'B' || chars[i] == 'C'){
                numbers[i] = 2;
            }
            else if(chars[i] == 'D' || chars[i] == 'E' || chars[i] == 'F'){
                numbers[i] = 3;
            }
            else if(chars[i] == 'G' || chars[i] == 'H' || chars[i] == 'I'){
                numbers[i] = 4;
            }
            else if(chars[i] == 'J' || chars[i] == 'K' || chars[i] == 'L'){
                numbers[i] = 5;
            }
            else if(chars[i] == 'M' || chars[i] == 'N' || chars[i] == 'O'){
                numbers[i] = 6;
            }
            else if(chars[i] == 'P' || chars[i] == 'Q' || chars[i] == 'R' || chars[i] == 'S'){
                numbers[i] = 7;
            }
            else if(chars[i] == 'T' || chars[i] == 'U' || chars[i] == 'V'){
                numbers[i] = 8;
            }
            else if(chars[i] == 'W' || chars[i] == 'X' || chars[i] == 'Y' || chars[i] == 'Z'){
                numbers[i] = 9;
            }
            else{
                numbers[i] = 0;
            }
        }

        int result = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] != 0){
                result += numbers[i] + 1;
            }
            else{
                result += 11;
            }
        }
        System.out.println(result);


    }
}
