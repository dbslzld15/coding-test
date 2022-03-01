package codingtest.inflearn.string;

import java.util.ArrayList;
import java.util.List;

public class 문자거리 {
    public int[] solution(String str, char c) {
        int[] answer= new int[str.length()];
        List<Integer> arr = new ArrayList<>();
        int index = str.indexOf(String.valueOf(c));

        while(index != -1){
            arr.add(index);
            index = str.indexOf(String.valueOf(c), index+1);
        }

        for(int i=0; i<str.length(); i++){
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) {
                temp.add(Math.abs(num-i));
            }
            answer[i] = temp.stream().mapToInt(a->a).min().getAsInt();
        }

        return answer;
    }

    public int[] solution2(String str, char c) {
        int[] answer= new int[str.length()];
        int p = 1000;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                p = 0;
            } else {
                p++;
            }
            answer[i] = p;
        }

        p = 1000;
        for(int i=str.length()-1; i>=0; i--){
            if(str.charAt(i)==c){
                p = 0;
                answer[i] = p;
            } else {
                p ++;
                answer[i] = Math.min(answer[i], p);
            }
        }
        return answer;
    }
}
