package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ACMcraft {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        for(int i = 0; i < t; i++) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] score = new int[n+1];
            int[] cnt = new int[n+1];
            cnt[0] = -1;
            int[] dp = new int[n+1];
            for(int j = 1; j <= n; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }
            for(int j = 0; j <= n; j++) {
                list.add(new ArrayList<>());
            }

            for(int j = 1; j <= k; j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.get(a).add(b);
                cnt[b]++;
            }
            for(int j = 0; j < cnt.length; j++) {
                if(cnt[j] == 0) {
                    queue.offer(j);
                    dp[j] = score[j];
                }
            }
            int answer = Integer.parseInt(br.readLine());

            while (!queue.isEmpty()) {
                int a = queue.poll();
                if(a == answer) {
                    break;
                }
                List<Integer> list1 = list.get(a);

                for (Integer integer : list1) {
                    cnt[integer]--;
                    if (cnt[integer] == 0) {
                        queue.offer(integer);
                    }
                    dp[integer] = Math.max(dp[integer], dp[a] + score[integer]);
                }

            }
            System.out.println(dp[answer]);
        }
    }
}
