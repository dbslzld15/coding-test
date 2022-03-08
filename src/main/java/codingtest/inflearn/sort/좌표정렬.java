package codingtest.inflearn.sort;

import codingtest.Main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class 좌표정렬 {
    private String[] solution(int[] x, int[] y, int M) {
        String[] answer = new String[M];
        List<Pos> list = new ArrayList<>();
        for(int i=0; i<M; i++){
            list.add(new Pos(x[i], y[i]));
        }

        List<Pos> sortedPos = list
                .stream()
                .sorted(Comparator.comparing(i -> i.y))
                .sorted(Comparator.comparing(i -> i.x))
                .collect(Collectors.toList());

        int idx = 0;
        for (Pos sortedPo : sortedPos) {
            answer[idx++] = sortedPo.x + " " + sortedPo.y;
        }
        return answer;
    }

    static class Pos{
        int x;
        int y;

        Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
