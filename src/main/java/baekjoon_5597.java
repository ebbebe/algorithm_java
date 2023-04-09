import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class baekjoon_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer[] number_list = new Integer[30];


        for(int i = 0; i < 30; i++){
            number_list[i] = i+1;
        }

        List<Integer> intList = new ArrayList<>(Arrays.asList(number_list));

        for(int i = 0; i < 28; i++){
            Integer number = Integer.parseInt(br.readLine());
            intList.remove(number);
        }

        if(intList.get(0) > intList.get(1)){
            System.out.println(intList.get(1));
            System.out.println(intList.get(0));
        }else{
            System.out.println(intList.get(0));
            System.out.println(intList.get(1));
        }
    }
}
