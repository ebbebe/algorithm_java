import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> int_arr = new ArrayList<Integer>();


        int_arr.add(1);
        int_arr.add(2);
        int_arr.add(3);

        System.out.println(int_arr);
        int_arr.remove(1);
        System.out.println(int_arr.get(1));




    }
}
