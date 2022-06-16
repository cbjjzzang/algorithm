package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 동전 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] c = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            c[i] = Integer.parseInt(br.readLine());
        }

        for(int i=n-1; i >=0; i--){
            if(c[i] <= k){
                cnt += k / c[i];
                k = k % c[i];
            }
        }
        System.out.println(cnt);

    }

}
