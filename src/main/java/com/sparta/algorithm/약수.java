package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 약수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 1;
        int min = 1000000;

        while (n-- > 0){
            int a = Integer.parseInt(st.nextToken());
            if(a > max){
                max = a;
            }
            if(a < min){
                min = a;
            }

        }
        System.out.println(max * min);
    }
}
