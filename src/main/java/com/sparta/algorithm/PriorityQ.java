package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new java.util.PriorityQueue<>(Collections.reverseOrder()); //최대값을 구하기 위해 내림차순
        for(int i = 0; i < n; i++){
            int m = Integer.parseInt(br.readLine());

            if(m == 0){
                if(queue.size() == 0){
                    sb.append("0\n");
                }else{
                    sb.append(queue.poll()).append('\n');
                }
            }else{
                queue.add(m);
            }
        }
        System.out.println(sb);
    }
}
