package codingtest.inflearn.stackqueue;

import java.util.Stack;

public class 올바른괄호 {
    private String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if(c == '(') stack.push('(');
            else{
                if(stack.isEmpty()){
                    return "NO";
                }
                stack.pop();
            }
        }

        if(!stack.isEmpty()) return "NO";
        return answer;
    }
}
