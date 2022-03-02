package codingtest;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[M][N];
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
    }
}

