package codingtest.inflearn.array;

public class 피보나치수열 {
    static int[] memo;

    private void solution(int n) {
        fibo(n);
    }

    private int fibo(int n) {
        if(memo[n] != 0) return memo[n];
        if(n==1) return memo[n] = 1;
        else if(n==2) return memo[n] = 1;
        return memo[n] = fibo(n-1) + fibo(n-2);
    }
}
