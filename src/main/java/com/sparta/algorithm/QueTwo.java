package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QueTwo {

    public static int[] stack;
    public static int size = 0;
    public static int front = 0;
    public static int back = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        stack = new int[n];

        while(true){
            if(n == 0){
                break;
            }
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
            }else if(next.equals("front")){
                sb.append(front()).append('\n');
            }else{
                sb.append(back()).append('\n');
            }


            n--;
        }
        System.out.println(sb);
    }

    public static void push(int item) {
        stack[back] = item;
        back++;
        size++;
    }

    public static int pop() {
        if(size == 0) {
            return -1;
        }
        else {
            int res = stack[front];
            size--;
            front++;
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

    public static int front() {
        if(size == 0) {
            return -1;
        }
        else {
            return stack[front];
        }
    }

    public static int back(){
        if(size == 0){
            return -1;
        }else{
            return stack[back-1];
        }

    }
}
