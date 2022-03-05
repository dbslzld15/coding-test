package codingtest.inflearn.stackqueue;

import java.util.Stack;

public class 후위식연산 {
    private int solution(String str) {
        char[] chars = str.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (char c : chars) {
            if(Character.isDigit(c)){
                stack.push(Character.getNumericValue(c));
            } else {
                int top1 = stack.pop();
                int top2 = stack.pop();
                if(c == '+'){
                    stack.push(top1+top2);
                } else if(c == '-') {
                    stack.push(top2-top1);
                } else if(c == '*') {
                    stack.push(top2*top1);
                } else if(c == '/') {
                    stack.push(top2/top1);
                }
            }
        }
        return stack.pop();
    }
}
