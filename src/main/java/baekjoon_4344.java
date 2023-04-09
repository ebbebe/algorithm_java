import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon_4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int loop_cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < loop_cnt; i++){

            String[] input = br.readLine().split(" ");
            float class_score = 0;
            int class_length = 0;
            int[] arr_score = new int[input.length - 1];
            int idx = 0;

            for (int j = 0; j < input.length; j++) {
                if(j == 0){
                     class_length = Integer.parseInt(input[0]);
                }else{
                    class_score += Float.parseFloat(input[j]);
                    arr_score[idx] = Integer.parseInt(input[j]);
                    idx += 1;
                }

            }

            class_score = class_score / class_length;
            int high_count = 0;

            // 점수 중 평균 넘는 값 몇 개 있는지 체크
            for (int j = 0; j < arr_score.length; j++) {
                if(class_score < arr_score[j]){
                    high_count += 1;
                }
            }


            float v = (high_count / (float) class_length) * 100;
            System.out.println(String.format("%.3f", v) + "%");

        }

    }




    // 평균 구하기
    // 평균보다 높은 점수가 몇개인지 카운트
    // 퍼센트로 반올림하여 소수점 셋째자리까지 환산
}
