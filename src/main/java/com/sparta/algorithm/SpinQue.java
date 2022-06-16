package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class SpinQue {

    public static void main(String[] args) throws IOException {
        LinkedList<Integer> deque = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for(int i = 1; i<=n; i++){
            deque.offer(i);
        }
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < m; i++){
            int num = Integer.parseInt(st.nextToken());
            int find = deque.indexOf(num);
            int half;

            if(deque.size() % 2 == 0){
                half = deque.size() / 2 -1;
            }else{
                half = deque.size() / 2;
            }

            if(find <= half){
                for(int j = 0; j < find; j++){
                    int a = deque.pollFirst();
                    deque.offerLast(a);
                    cnt++;
                }
            }else{
                for(int j = 0; j < deque.size()-find; j++){
                    int a = deque.pollLast();
                    deque.offerFirst(a);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);


    }
}
