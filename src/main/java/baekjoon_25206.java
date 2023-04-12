import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class baekjoon_25206 {
    public static void main(String[] args) throws IOException {
        //테스트
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Float> ab_list = new HashMap<>();

        ab_list.put("A+", 4.5f);
        ab_list.put("A0", 4.0f);
        ab_list.put("B+", 3.5f);
        ab_list.put("B0", 3.0f);
        ab_list.put("C+", 2.5f);
        ab_list.put("C0", 2.0f);
        ab_list.put("D+", 1.5f);
        ab_list.put("D0", 1.0f);
        ab_list.put("F", 0.0f);
        ab_list.put("P", 0.0f);


        float class_subject_sum = 0; // 전공과목별 합
        float score_sum = 0; // 학점의 총합

        for (int i = 0; i < 20; i++) {
            String[] str = br.readLine().split(" ");
            float score = Float.parseFloat(str[1]);
            String ab_str = str[2];

            if(!ab_str.equals("P")){ // 학점의 총합 구하기
                score_sum += score;
            }


            float ab_score = SubCheck(score, ab_str, ab_list);
            class_subject_sum += ab_score; // 전공과목별(학점 X 과목평점)의 합 구하기
        }

        float result = class_subject_sum / score_sum;

        System.out.println(result);
    }

    public static float SubCheck(float score, String ab_score, Map<String, Float> ab_list){
        Object o = ab_list.get(ab_score);
        float o1 = (float) o;
        float result = score * o1;
        return result;
    }
}
