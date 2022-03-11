package codingtest.inflearn.dfs;

import java.util.ArrayList;

public class 경로탐색 {
    static int[][] graph;
    static int[] nodeVisited;
    static ArrayList<ArrayList<Integer>> graph2;
    static int answer = 0;

    public int solution1(int N, int M, int[] arr1, int[] arr2) { //인접행렬 활용
        for(int i=0; i<M; i ++){
            graph[arr1[i]][arr2[i]] = 1;
        }
        nodeVisited[1] = 1;
        DFS1(N, 1);

        return 0;
    }

    public void DFS1(int N, int num){
        if(num==N) {
            answer++;
        }
        else {
            for(int i=1; i<=N; i++){
                if(graph[num][i]==1 && nodeVisited[i]==0){
                    nodeVisited[i] = 1;
                    DFS1(N, i);
                    nodeVisited[i] = 0; // 백트래킹
                }
            }
        }
    }

    public int solution2(int N, int M, int[] arr1, int[] arr2) { //인접리스트 활용
        graph2 = new ArrayList<>();
        for(int i=0; i<=N; i ++){
            graph2.add(new ArrayList<>());
        }

        for(int i=0; i<M; i++){
            graph2.get(arr1[i]).add(arr2[i]);
        }

        nodeVisited[1] = 1;
        DFS2(N, 1);

        return 0;
    }

    public void DFS2(int N, int num){
        if(num==N) {
            answer++;
        }
        else {
            for(int nextNum : graph2.get(N)){
                if(nodeVisited[nextNum]==0){
                    nodeVisited[nextNum]=1;
                    DFS2(N, nextNum);
                    nodeVisited[nextNum] = 0;
                }
            }
        }
    }
}
