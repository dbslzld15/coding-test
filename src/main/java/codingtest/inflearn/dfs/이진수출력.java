package codingtest.inflearn.dfs;

public class 이진수출력 {
    private String recursive(int n){
        if(n==0) return "0";
        else if(n==1) return "1";
        else return recursive(n/2) + n%2;
    }
}
