package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackNumber {
    public static void main(String[] args) throws IOException {


        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int s = 0;

        while(n -- > 0){

            int v = Integer.parseInt(br.readLine());

            if(v > s){
                for(int i = s+1; i <= v; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                s = v;
            }else if(stack.peek() != v){
                System.out.println("NO");
                return;
            }

            stack.pop();
            sb.append('-').append('\n');
        }
        System.out.println(sb);
    }
}
