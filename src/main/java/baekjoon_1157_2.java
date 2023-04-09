import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class baekjoon_1157_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] arr_char = str.toUpperCase(Locale.ROOT).toCharArray();


        HashSet<Character> hashSet = new HashSet<>();

        for(int i = 0; i < arr_char.length; i++){
            hashSet.add(arr_char[i]);
        }

        Iterator it = hashSet.iterator();

        int[] char_cnt = new int[hashSet.size()];
        char[] char_str = new char[hashSet.size()];

        for(int i = 0; i < char_cnt.length; i++){
            char_cnt[i] = 0;
        }


        int idx = 0;
        while(it.hasNext()){
            char target_char = (char) it.next();
            char_str[idx] = target_char;
            for(int i = 0; i < arr_char.length; i++){
                if(target_char == arr_char[i]){
                    char_cnt[idx] = char_cnt[idx] + 1;
                }
            }
            idx += 1;
        }


        char result = char_str[0];
        int max = char_cnt[0];
        boolean isDup = false;
        for (int j = 1; j < char_cnt.length; j++) {
            if(max < char_cnt[j]){
                max = char_cnt[j];
                result = char_str[j];
                isDup = false;
            }
            else if(max == char_cnt[j]){
                isDup = true;
            }
        }

        if(isDup){
            result = '?';
        }


        System.out.println(result);
        // 문자열을 배열로 받기
        // 배열의 크기만큼 반복문 돌려서 이중 반복문으로 서로 다른 문자열만 들고있는 ArrayList 배열 생성하기
        // 반복문으로 비교해서 중복 값 카운트 하기
    }
}