package codingtest.inflearn.string;

public class 문장속단어 {
    public String solution(String str) {
        String answer = "";
        String[] arr = str.split(" ");

        for (String s : arr) {
            if(s.length() > answer.length()){
                answer = s;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;

        while ((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1); // 사용한 단어는 문자열에서 자르기
        }
        if(str.length() >m) answer = str; //마지막 단어 처리

        return answer;
    }
}
