package codingtest.inflearn.twopointer;

import java.util.*;

public class 공통원소구하기 {
    private int[] solution2(int[] arr1, int[] arr2) {
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]==arr2[p2]){
                answer.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1]<arr2[p2]) p1++;
            else p2++;
        }
        return answer.stream().mapToInt(i->i).toArray();
    }

    private int[] solution(int[] arr1, int[] arr2) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : arr1) {
            int cnt = map.getOrDefault(i, 0);
            map.put(i, cnt+1);
        }

        for (int i : arr2) {
            int cnt = map.getOrDefault(i, 0);
            map.put(i, cnt+1);
        }

        for (int key : map.keySet()) {
            int value = map.get(key);
            if(value>1) list.add(key);
        }
        int[] answer = new int[list.size()]; //list를 스트림을 이용해 배열로 바꾸고싶지만 시간 초과 에러
        int i = 0;
        for (int num : list) {
            answer[i++] = num;
        }
        Arrays.sort(answer);

        return answer;
    }
}
