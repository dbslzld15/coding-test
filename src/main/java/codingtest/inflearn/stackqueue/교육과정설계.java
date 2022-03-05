package codingtest.inflearn.stackqueue;

import java.util.LinkedList;
import java.util.Queue;

public class 교육과정설계 {

    private String solution(String str1, String str2) {
        String answer = "";
        Queue<Character> queue = new LinkedList<>();

        for(char c : str1.toCharArray()){
            queue.offer(c);
        }

        for(char c : str2.toCharArray()){
            if(queue.contains(c)){
                if(queue.peek() == c) answer += queue.poll();
            }
        }

        if(answer.equals(str1)) return "YES";
        return "NO";
    }

    private String solution2(String str1, String str2) {
        String answer = "";
        Queue<Character> queue = new LinkedList<>();

        for(char c : str1.toCharArray()){
            queue.offer(c);
        }

        for(char c : str2.toCharArray()){
            if(queue.contains(c)){
                answer += c;
            }
        }

        if(answer.equals(str1)){
            return "YES";
        }

        return "NO";
    }
}
