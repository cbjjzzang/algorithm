package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 평균 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            arr[i] = a;
        }

        Arrays.sort(arr);
        int max = arr[arr.length-1];
        float sum = 0f;

        for(int i = 0; i < n; i++) {
            float a =  ((float) arr[i] / max) * 100;
            sum += a;
        }
        System.out.println(sum/n);
    }
}
