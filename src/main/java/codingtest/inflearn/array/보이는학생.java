package codingtest.inflearn.array;

public class 보이는학생 {
    private int solution(int n, int[] arr) {
        int answer = 0;
        int maxNum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>maxNum){
                answer+=1;
                maxNum = arr[i];
            }
        }
        return answer;
    }
}
