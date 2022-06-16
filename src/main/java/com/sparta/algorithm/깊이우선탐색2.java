package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 깊이우선탐색2 {

    static List<Integer>[] info;
    static boolean[] visit;
    static int[] record;
    static int count = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        info = new List[n+1];
        visit = new boolean[n+1];
        record = new int[n+1];

        for(int i = 1; i <= n; i++){
            info[i] = new ArrayList<>();
        }

        for(int i = 1; i <= m; i++){
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            info[from].add(to);
            info[to].add(from);
        }

        for(int i = 1; i <= n; i++){
            info[i].sort(Collections.reverseOrder());
        }
        visit[r] = true;
        dfs(r);

        for(int i = 1; i <= n; i++){
            System.out.println(record[i]);
        }


    }

    public static void dfs(int a){
        record[a] = count;
        count++;
        List<Integer> nextnodes = info[a];
        for(Integer node : nextnodes){
            if(!visit[node]){
                visit[node] = true;
                dfs(node);
            }
        }
    }
}
