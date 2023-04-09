import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_price = Integer.parseInt(br.readLine());
        int comp_price = 0;
        int num = Integer.parseInt(br.readLine());
        String result;
        for(int i = 0; i < num; i++){
            String[] input = br.readLine().split(" ");
            int price = Integer.parseInt(input[0]);
            int count = Integer.parseInt(input[1]);

            comp_price += price * count;
        }


        if(total_price == comp_price){
            result = "Yes";
        }else{
            result = "No";
        }

        System.out.println(result);

    }
}
