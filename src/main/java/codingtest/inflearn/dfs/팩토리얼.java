package codingtest.inflearn.dfs;

public class 팩토리얼 {
    private int recursive(int n){
        if(n==1) return 1;
        else return recursive(n-1) * n;
    }
}
