import java.io.*;

public class baekjoon_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++){
            String[] input = br.readLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            bw.write(num1 + num2 + "\n");
        }

        bw.flush();
        bw.close();
    }
}
