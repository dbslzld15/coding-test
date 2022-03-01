package codingtest.inflearn.string;

public class 팰린드롬 {

    public String solution(String str) {
        str = str.toLowerCase().replaceAll("[^a-z]", "");
        String tmp = new StringBuffer(str).reverse().toString();
        if(tmp.equals(str)) return "YES";
        else return "NO";
    }

    public String solution2(String str) {
        str = str.toLowerCase();
        String tmp = "";

        for(int i=0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                tmp += str.charAt(i);
            }
        }
        int i=0;
        while(i<tmp.length()/2){
            if(tmp.charAt(i) != tmp.charAt(tmp.length()-1-i)) return "NO";
            i++;
        }

        return "YES";
    }
}
