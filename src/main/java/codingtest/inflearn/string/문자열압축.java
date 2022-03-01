package codingtest.inflearn.string;

public class 문자열압축 {
    public String solution(String str){
        String answer = "";
        char[] chars = str.toCharArray();
        int cnt = 1;
        char prevChar = chars[0];

        for (int i=1; i<chars.length; i++) {
            if(prevChar == chars[i]){
                cnt += 1;
            } else {
                if(cnt>1) answer += prevChar + Integer.toString(cnt);
                else answer += prevChar;
                prevChar = chars[i];
                cnt = 1;
            }
        }
        if(cnt>1) answer += prevChar + Integer.toString(cnt);
        else answer += prevChar;

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        str += " ";
        int cnt = 1;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)) cnt++;
            else {
                if(cnt>1) answer += str.charAt(i) + String.valueOf(cnt);
                else answer += str.charAt(i);
                cnt = 1;

            }
        }
        return answer;
    }

}
