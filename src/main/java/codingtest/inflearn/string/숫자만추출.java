package codingtest.inflearn.string;

public class 숫자만추출 {
    public int solution(String str) {
        String s = str.replaceAll("[^0-9]", "");
        return Integer.parseInt(s);
    }

    public int solution2(String str) {
        int answer = 0;
        for(char x : str.toCharArray()) {
            if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
        }
        return answer;
    }
}
