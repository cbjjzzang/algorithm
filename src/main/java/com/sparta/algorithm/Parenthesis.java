package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while(t-- > 0){

            String s = br.readLine();
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '('|| c=='['){
                    stack.push(c);
                }else if(stack.empty()){
                    stack.push(c);
                    break;
                }else{
                    stack.pop();
                }
            }
            if(stack.empty()){
                sb.append("YES\n");
            }else{
                sb.append("NO\n");
            }

        }
        System.out.println(sb);
    }
}
