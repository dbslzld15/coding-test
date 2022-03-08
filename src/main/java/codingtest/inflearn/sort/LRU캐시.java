package codingtest.inflearn.sort;

public class LRU캐시 {

    private int[] solution(int N, int M, int[] arr) {
        int cache[] = new int[N];

        for(int x : arr){
            int pos = -1;
            for(int i=0; i<N; i++) if(x==cache[i]) pos = i;
            if(pos==-1){
                for(int i=N-1; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            } else {
                for(int i=pos; i>=1; i--){
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            }
        }
        return cache;
    }

    private int[] solution2(int N, int M, int[] arr) {
        int answer[] = new int[N];

        for(int i=0; i<M; i++){

            if(arr[i]==answer[0]) continue;

            int index = 0;
            for(int j=0; j<N; j++){
                if(answer[j]==arr[i]){
                    index = j;
                    break;
                }
            }

            if(index != 0){
                for(int j=index; j>=1; j--){
                    answer[j] = answer[j-1];
                }
                answer[0] = arr[i];
            } else {
                for(int j=N-1; j>=1; j--){
                    answer[j] = answer[j-1];
                }
                answer[0] = arr[i];
            }
        }
        return answer;
    }
}
