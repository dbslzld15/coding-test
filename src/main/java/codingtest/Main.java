package codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static int[] memo;
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        memo = new int[n+1];
        main.solution(n);
        for(int i=1; i<n+1; i++){
            System.out.print(memo[i] + " ");
        }
    }

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

