package codingtest.inflearn.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 그래프최단거리 {
    static int[] nodeVisited;
    static int[] dis;
    static ArrayList<ArrayList<Integer>> graph;

    public void BFS(int N){
        Queue<Integer> queue = new LinkedList<>();

        for(int i=2; i<=N; i++){
            int cnt = 0;
            nodeVisited = new int[N+1];
            queue.offer(1);

            while(!queue.isEmpty()){
                int len = queue.size();
                for(int j=0; j<len; j++){

                    int cur = queue.poll();
                    if(cur==i) {
                        System.out.println(i + " : " + cnt);
                        break;
                    }

                    for(int nextNum : graph.get(cur)){
                        if(nodeVisited[nextNum]==0){
                            nodeVisited[nextNum]=1;
                            queue.offer(nextNum);
                        }
                    }
                }
                cnt++;
            }

        }
    }

    public void BFS2(int v) {
        Queue<Integer> queue = new LinkedList<>();
        nodeVisited[v] = 1;
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()){
            int cur = queue.poll();
            for(int nextNum : graph.get(cur)){
                if(nodeVisited[nextNum]==0){
                    nodeVisited[nextNum] = 1;
                    queue.offer(nextNum);
                    dis[nextNum] = dis[cur] + 1; // dis라는 배열에 최단거리를 저장하는 방식
                }
            }
        }
    }
}
