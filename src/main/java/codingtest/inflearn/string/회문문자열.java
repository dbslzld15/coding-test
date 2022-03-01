package codingtest.inflearn.string;

public class 회문문자열 {
    public String solution(String str) {
        str = str.toLowerCase();
        char[] chars = str.toCharArray();
        int lt = 0, rt = str.length()-1;

        while(lt < rt) {
            if(chars[lt] == chars[rt]){
                lt++;
                rt--;
            } else {
                return "NO";
            }

        }

        return "YES";
    }

    public String solution2(String str) {
        StringBuffer sb = new StringBuffer(str);
        if(str.equalsIgnoreCase(sb.reverse().toString())){
            return "YES";
        } else {
            return "NO";
        }
    }
}
