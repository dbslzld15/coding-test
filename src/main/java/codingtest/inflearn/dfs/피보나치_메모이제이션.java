package codingtest.inflearn.dfs;

public class 피보나치_메모이제이션 {
    static int[] memo;
    private int recursive(int n){
        if(memo[n] != 0) return memo[n];
        if(n==1) return memo[n]=1;
        else if(n==2) return memo[n]=1;
        else return memo[n] = recursive(n-1) + recursive(n-2);
    }
}
