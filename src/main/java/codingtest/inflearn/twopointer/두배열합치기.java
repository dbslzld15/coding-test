package codingtest.inflearn.twopointer;

public class 두배열합치기 {
    private int[] solution(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length+arr2.length];
        int i = 0;
        int p1 = 0;
        int p2 = 0;

        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1] < arr2[p2]) answer[i++] = arr1[p1++];
            else answer[i++] = arr2[p2++];
        }

        while(p1<arr1.length){
            answer[i++] = arr1[p1++];
        }

        while(p2<arr2.length){
            answer[i++] = arr2[p2++];
        }
        return answer;
    }

    private int[] solution2(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length+arr2.length];
        int a=0;
        int b=0;

        for(int i=0; i<arr1.length+arr2.length; i++){
            if(a==arr1.length){
                answer[i] = arr2[b++];
                continue;
            }
            if(b==arr2.length){
                answer[i] = arr1[a++];
                continue;
            }

            if(arr1[a]<arr2[b]){
                answer[i] = arr1[a++];
            } else answer[i] = arr2[b++];
        }

        return answer;
    }
}
