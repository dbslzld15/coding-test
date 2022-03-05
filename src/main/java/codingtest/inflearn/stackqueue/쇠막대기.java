package codingtest.inflearn.stackqueue;

import java.util.Stack;

public class 쇠막대기 {
    private int solution(String str) {
        int answer = 0;
        boolean prevLazerExist = false;
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if(c == '('){
                stack.push(c);
                prevLazerExist = false;
            } else {
                if(prevLazerExist){
                    stack.pop();
                    answer+=1;
                } else {
                    stack.pop();
                    answer += stack.size();
                    prevLazerExist = true;
                }
            }
        }
        return answer;
    }

    private int solution2(String str) {
        int answer = 0;
        boolean prevLazerExist = false;
        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++){
            if(chars[i]=='(') stack.push('(');
            else{
                stack.pop();
                if(chars[i-1] == '(') answer+=stack.size();
                else answer++;
            }
        }

        return answer;
    }
}
