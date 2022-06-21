package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 피보나치수5 {
    static int[] arr = new int[21];
    static int a;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        arr[0] = 0;
        arr[1] = 1;
        int n = Integer.parseInt(br.readLine());

        System.out.println(solution(n));

    }

    public static int solution(int x){
        if(x == 0){
            return arr[0];
        }
        if(x == 1){
            return arr[1];
        }
        a = solution(x-1) + solution(x-2);
        arr[x] = a;
        return a;
    }
}
