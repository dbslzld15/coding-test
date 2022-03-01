package codingtest.inflearn.array;

public class 가위바위보 {
    private String[] solution(int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] > arr2[i]){
                if(arr1[i] - arr2[i] == 1) answer[i] = "A";
                else answer[i] = "B";
            } else if(arr1[i] < arr2[i]){
                if(arr2[i] - arr1[i] == 1) answer[i] = "B";
                else answer[i] = "A";
            } else {
                answer[i] = "D";
            }
        }
        return answer;
    }
}
