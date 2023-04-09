import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class baekjoon_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");


        int basket_num = Integer.parseInt(str[0]);
        int change_cnt = Integer.parseInt(str[1]);
        int[] basket = new int[basket_num];
        String result = "";

        for(int i = 0; i < basket_num; i++){
            basket[i] = i+1;
        }

        for(int i = 0; i < change_cnt; i++){
            String[] s = br.readLine().split(" ");
            int change_index1 = Integer.parseInt(s[0]) - 1;
            int change_index2 = Integer.parseInt(s[1]) - 1;
            int change_slot;

            change_slot = basket[change_index1];
            basket[change_index1] = basket[change_index2];
            basket[change_index2] = change_slot;
        }

        for(int i = 0; i < basket_num; i++){
            if(i == 0){
                result += basket[i];
            }else{
                result += " " + basket[i];
            }
        }

        System.out.println(result);
    }
}
