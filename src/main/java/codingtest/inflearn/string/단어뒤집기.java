package codingtest.inflearn.string;

public class 단어뒤집기 {
    public String[] solution(String[] arr) {
        String[] answer = new String[arr.length];
        for(int i=0; i < arr.length; i++){
            StringBuffer sb = new StringBuffer(arr[i]);
            answer[i] = sb.reverse().toString();
        }
        return answer;
    }

    public String[] solution2(String[] arr) {
        String[] answer = new String[arr.length];
        int i = 0;

        for (String s : arr) {
            char[] c = s.toCharArray();
            int lt = 0, rt = c.length-1;
            while(lt < rt) {
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
            answer[i++] = String.valueOf(c);
        }
        return answer;
    }
}
