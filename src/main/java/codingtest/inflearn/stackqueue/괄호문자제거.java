package codingtest.inflearn.stackqueue;

import java.util.Stack;

public class 괄호문자제거 {
    private String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(c == '('){
                stack.push('C');
            } else if(c == ')'){
                stack.pop();
            } else if(Character.isAlphabetic(c)){
                if(stack.isEmpty()) answer += c;
            }
        }

        return answer;
    }
}
