package codingtest.inflearn.string;

public class 문자찾기 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                answer += 1;
            }
        }

        return answer;
    }
}
