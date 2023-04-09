import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//(나중에 더 빠르게 바꿔보기)
public class baekjoon_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        int[] basket_list = new int[N];


        for (int i = 0; i < N; i++){
            basket_list[i] = i+1;
        }

        for(int i = 0; i < M; i++){
            String[] str_2 = br.readLine().split(" ");

            int input_i = Integer.parseInt(str_2[0]);
            int input_j = Integer.parseInt(str_2[1]);


            basket_list = ReverseArray(basket_list, input_i, input_j);
        }

        String result = "";
        for(int i = 0; i < basket_list.length; i++){
            if(i == 0){
                result += basket_list[i];
            }else{
                result += " " + basket_list[i];
            }
        }
        System.out.println(result);
    }
    public static int[] ReverseArray(int[] array, int start, int end){
        int index = (end - start) + 1;
        int[] rv_arr = new int[index];

        for(int i = 0; i < rv_arr.length; i++){
            rv_arr[i] = array[(start - 1) + i];
        }

        int array_index = 0;
        for(int i = (rv_arr.length - 1); i >= 0; i --){ // array 배열 인덱스 값 증가하면서 rv_arr 배열 인덱스 값 감소


            array[(start-1) + array_index] = rv_arr[i];
            array_index += 1;
        }

        String test_str = "";
        for(int i = 0; i < array.length; i++){
            test_str += array[i];
        }

        return array;
    }
}
