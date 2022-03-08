package codingtest.inflearn.sort;

public class 삽입정렬 {
    private int[] solution(int N, int[] arr) {
        //삽입정렬은 기준의 왼쪽값들은 정렬되어 있음
        for(int i=1; i<N; i++){
            int tmp = arr[i], j;
            for(j=i-1; j>=0; j--){
                if(arr[j]>tmp) arr[j+1] = arr[j]; //값을 뒤로 밀어줌
                else break;
            }
            arr[j+1] = tmp; //tmp의 원래자리에 안착

        }

        return arr;
    }
}
