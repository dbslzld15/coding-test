package codingtest.inflearn.sort;

public class 버블정렬 {
    private int[] solution(int N, int[] arr) {
        //버블정렬은 뒤쪽부터 큰값으로 채워넣는다고 생각 (오름차순일 경우)
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
