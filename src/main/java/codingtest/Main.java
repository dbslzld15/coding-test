package codingtest;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = scanner.next();
        System.out.println(main.solution2(n, str));
    }

    public String solution(int n, String str) {
        String answer = "";
        String temp = "";

        if(str.charAt(0)=='#') temp += '1';
        else temp += '0';

        for(int i=0; i<str.length(); i++){
            if(i%7==0){
                int num = Integer.valueOf(temp, 2);
                answer += (char)num;
                temp = "";
            }
            if(str.charAt(i)=='#') temp += '1';
            else temp += '0';
        }
        int num = Integer.valueOf(temp, 2);
        answer += (char)num;

        return answer;
    }

    public String solution2(int n, String str) {
        String answer = "";
        for(int i=0; i<n; i++){
            String temp = str.substring(0, 7).replace('#', '1').replace('*', '0');
            int num = Integer.parseInt(temp, 2);
            answer += (char)num;
            str = str.substring(7);
        }

        return answer;
    }
}

