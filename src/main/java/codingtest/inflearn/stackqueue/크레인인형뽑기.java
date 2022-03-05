package codingtest.inflearn.stackqueue;

import java.util.Stack;

public class 크레인인형뽑기 {
    private int solution(int N, int[][] board, int M, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<M; i++){
            int y = moves[i]-1;
            int x = 0;

            while(board[x][y]==0 && x<N-1){ //인형이 있는 위치까지 도달
                x++;
            }

            if(board[x][y] != 0){
                if(stack.isEmpty()) stack.push(board[x][y]);
                else if(stack.peek() == board[x][y]){
                    stack.pop();
                    answer += 2;
                } else {
                    stack.push(board[x][y]);
                }
                board[x][y] = 0;
            }

        }

        return answer;
    }
}
