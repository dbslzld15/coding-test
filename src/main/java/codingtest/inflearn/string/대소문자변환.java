package codingtest.inflearn.string;

public class 대소문자변환 {
    public String solution(String str) {
        String answer = "";

        for(char c : str.toCharArray()){
            if(Character.isUpperCase(c)){
                answer += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)){
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }
}
