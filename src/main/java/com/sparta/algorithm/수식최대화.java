package com.sparta.algorithm;

import java.util.ArrayList;

public class 수식최대화 {

    static char[] prior={'+', '-', '*'};
    static boolean[] check = new boolean[3];
    static ArrayList<Long> nums = new ArrayList<>();
    static ArrayList<Character> ops = new ArrayList<>();
    static long answer;

    public static long solution(String expression) {
        answer = 0;

        String num = "";
        for(int i = 0; i < expression.length(); i++){
            if(expression.charAt(i) >= '0' && expression.charAt(i) <= '9'){
                num += expression.charAt(i);
            }else{
                nums.add(Long.valueOf(num));
                ops.add(expression.charAt(i));
                num = "";
            }
        }
        nums.add(Long.valueOf(num));

        dfs(0, new char[3]);

        return answer;
    }

    public static void dfs(int count, char[] p){
        if(count == 3){
            ArrayList<Long> cNum = new ArrayList<>(nums);
            ArrayList<Character> cOps = new ArrayList<>(ops);

            for(int i = 0; i < p.length; i++){
                for(int j = 0; j < cOps.size(); j++){
                    if(p[i] == cOps.get(j)){
                        Long res = calc(cNum.remove(j), cNum.remove(j), p[i]);
                        cNum.add(j, res);
                        cOps.remove(j);
                        j--;
                    }
                }
            }
            answer = Math.max(answer, Math.abs(cNum.get(0)));
            return;
         }

        for(int i = 0; i < 3; i++){
            if(!check[i]){
                check[i] = true;
                p[count] = prior[i];
                dfs(count+1, p);
                check[i] = false;
            }
        }
    }

    public static Long calc(Long num1, Long num2, char op){
        if(op == '+'){
            return num1 + num2;
        }else if(op == '-'){
            return num1 - num2;
        }else{
            return num1 * num2;
        }
    }
}
