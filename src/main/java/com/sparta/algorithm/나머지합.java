package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 나머지합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int sum = 0;
        int[] cnt = new int[1000];
        long answer = 0;
        while (n--> 0) {
            int a = Integer.parseInt(st.nextToken());
            sum += a;
            sum %= m;
            answer += cnt[sum];
            cnt[sum]++;

            if(sum == 0) {
                answer++;
            }
        }
        System.out.println(answer);


    }
}
