package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 나무자르기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] tree = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            tree[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tree);

        int start = 0;
        int end = tree[n-1];

        while (start < end){

            int mid = (start + end)/2;
            long sum = 0;

            for(int i = 0; i < n; i++){
                if(tree[i] - mid > 0){
                    sum += tree[i] - mid;
                }
            }

            if(sum < m){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        System.out.println(start-1);

    }
}
