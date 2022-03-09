package codingtest.inflearn.dfs;

public class 재귀함수 {

    private String recursive(int n){
        if(n==1) return "1";
        else return recursive(n-1) + " " + n;
    }
}
