package codingtest.inflearn.sort;

public class 선택정렬 {
    private int[] solution(int N, int[] arr) {
        //선택정렬은 i는 0~N까지 J는 i+1 부터 N까지 최소값 인덱스를 찾아 교환
        for(int i=0; i<N-1; i++){
            int minIdx = i;
            for(int j= i+1; j<N; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}
