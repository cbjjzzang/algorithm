package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StackOne {

    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());


        stack = new int[N];

        for(int i = 0; i<N; i++){

            StringTokenizer st = new StringTokenizer(br.readLine());

            String next = st.nextToken();
            if(next.equals("push")){
                push(Integer.parseInt(st.nextToken()));
            }else if(next.equals("pop")){
                sb.append(pop()).append('\n');
            }else if(next.equals("size")){
                sb.append(size()).append('\n');
            }else if(next.equals("empty")){
                sb.append(empty()).append('\n');
            }else{
                sb.append(top()).append('\n');
            }

        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[size] = item;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    public static int size() {
        return size;
    }

    public static int empty() {
        if(size == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public static int top() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[size - 1];
        }
    }
}
