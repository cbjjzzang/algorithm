package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이항계수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = 1;
        int b = 1;
        int c = 1;

        for(int i = 1; i<=n; i++){
            a *=i;
        }
        for(int i = 1; i<=k; i++){
            b *=i;
        }
        for(int i = 1; i<=n-k; i++){
            c *= i;
        }
        System.out.println(a/(b*c));

    }
    //팩토리얼 공식
    public static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
