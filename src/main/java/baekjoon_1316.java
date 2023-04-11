import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class baekjoon_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repeat_cnt = Integer.parseInt(br.readLine());
        int group_cnt = 0;


        for (int i = 0; i < repeat_cnt; i++) { // 반복 수 만큼 입력 받기
            ArrayList<Character> arl_char = new ArrayList<>();
            boolean isGroup = true;
            char[] chars = br.readLine().toCharArray();
            for (int j = 0; j < chars.length; j++) {
                arl_char.add(chars[j]);
            }

            while(isGroup){
                boolean isRepeat = false;
                // 문자 바로 앞 인덱스 문자와 비교해서 같으면 삭제
                for (int j = 0; j < arl_char.size() - 1; j++) {

                    if(arl_char.get(j) == arl_char.get(j+1)){
                        arl_char.remove(j+1);
                        isRepeat = true;
                    }
                }


                if(isRepeat == false){ // 중복값 있는지 확인 후 있다면 그룹단어 X
                    boolean isWord = true;
                    for (int j = 0; j < arl_char.size(); j++) {
                        for (int k = j+1; k < arl_char.size(); k++) {
                            if(arl_char.get(j) == arl_char.get(k)){
                                isWord = false;
                            }
                        }
                    }

                    if(isWord){
                        group_cnt += 1;

                    }
                    isGroup = false;
                }
            }
        }


        System.out.println(group_cnt);
    }
}
