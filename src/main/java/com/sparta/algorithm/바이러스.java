package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 바이러스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int count = 0;
        List<Integer>[] info = new List[a+1];
        boolean[] visit = new boolean[a+1];
        StringTokenizer st;

        for(int i = 1; i <= a; i++){
            info[i] = new ArrayList<>();
        }

        for(int i = 1; i <= b; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            info[u].add(v);
            info[v].add(u);
        }

        visit[1] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);

        while(!q.isEmpty()){
            int temp = q.poll();

            List<Integer> nextnodes = info[temp];
            for(Integer nextnode : nextnodes){
                if(!visit[nextnode]){
                    visit[nextnode] = true;
                    q.offer(nextnode);
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
