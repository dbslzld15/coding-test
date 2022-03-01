package codingtest.inflearn.string;

public class 중복문자제거 {
    public String solution(String str) {
        String answer = "";
        char[] chars = str.toCharArray();

        for (char c : chars) {
            if(!answer.contains(String.valueOf(c))){
                answer += c;
            }
        }
        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        for(int i=0; i<str.length(); i++){
            if(str.indexOf(str.charAt(i))==i) answer += str.charAt(i);
        }

        return answer;
    }
}
