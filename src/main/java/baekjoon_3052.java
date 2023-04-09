import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class baekjoon_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num_list = new int[10];
        int[] div_list = new int[10];

        for(int i = 0; i < 10; i++){
            num_list[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < 10; i++){
            div_list[i] = num_list[i] % 42;
        }


        List<Integer> checked_list = new ArrayList<>();
        
        
        
        for(int i = 0; i < 10; i++){
            Boolean IsDouble = true;
            for(int j = i+1; j <10; j++){
                if(div_list[i] == div_list[j]){
                    IsDouble = false;
                }
            }
            if(IsDouble == true){
                checked_list.add(div_list[i]);
            }
        }

        System.out.println(checked_list.size());

    }
}
