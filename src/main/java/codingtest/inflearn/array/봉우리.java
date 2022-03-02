package codingtest.inflearn.array;

public class 봉우리 {
    private int solution(int n, int[][] arr) {
        int answer = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>=0 && nx<n && ny>=0 && ny<n && arr[i][j] <= arr[nx][ny]){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer ++;
            }
        }

        return answer;
    }

    private int solution2(int n, int[][] arr) {
        int answer = 0;
        int[][] new_arr = new int[n+2][n+2];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                new_arr[i][j] = arr[i-1][j-1];
            }
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(new_arr[i][j] > new_arr[i-1][j]
                        && new_arr[i][j] > new_arr[i][j-1]
                        && new_arr[i][j] > new_arr[i+1][j]
                        && new_arr[i][j] > new_arr[i][j+1]){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}
