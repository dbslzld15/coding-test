package codingtest.inflearn.stackqueue;

import codingtest.Main;

import java.util.LinkedList;
import java.util.Queue;

public class 응급실 {
    private int solution(int N, int M, int[] arr) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i=0; i< arr.length; i++) {
            queue.offer(new Person(i, arr[i]));
        }

        while(!queue.isEmpty()){
            int maxNum = queue.stream().mapToInt(i-> i.score).max().getAsInt();
            if(maxNum == queue.peek().score){
                answer++;
                if(queue.peek().index == M){
                    break;
                }
                queue.poll();
            } else {
                queue.offer(queue.poll());
            }
        }

        return answer;
    }

    static class Person{
        int index;
        int score;

        public Person(int index, int score){
            this.index = index;
            this.score = score;
        }
    }
}
