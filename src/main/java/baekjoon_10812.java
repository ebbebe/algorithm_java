import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon_10812 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int basket_length = Integer.parseInt(str[0]);
        int rotate_count = Integer.parseInt(str[1]);

        ArrayList<Integer> basket = new ArrayList<>();

        for (int i = 0; i < basket_length; i++) {
            basket.add(i + 1);
        }

       for(int i = 0; i < rotate_count; i++){
           String[] s = br.readLine().split(" ");
           int begin = Integer.parseInt(s[0]);
           int mid = Integer.parseInt(s[2]);
           int end = Integer.parseInt(s[1]);
           int start_idx = begin - 1 ;
           int end_idx = mid - 1 ;
           int add_idx = end;
           int change_count = 0;

           for (int j = start_idx; j < end_idx; j++) {
               change_count += 1;
               basket.add(add_idx, basket.get(j));
               add_idx += 1;
           }

           for (int j = 0; j < change_count; j++) {
               basket.remove(start_idx);
           }



       }

       String result = "";
        for (int i = 0; i < basket.size(); i++) {
            if(i == 0){
                result += basket.get(i);
            }else{
                result += " " + basket.get(i);
            }
        }


        System.out.println(result);
    }
}
