package codingtest.inflearn.string;

public class 특정문자뒤집기 {

    public String solution(String arr) {
        String answer = "";
        char[] chars = arr.toCharArray();
        int lt = 0, rt = arr.length() - 1;
        while(lt < rt) {
            if(!Character.isAlphabetic(chars[lt])) lt++;
            else if(!Character.isAlphabetic(chars[rt])) rt--;
            else {
                char tmp = chars[lt];
                chars[lt] = chars[rt];
                chars[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(chars);
        return answer;
    }
}
