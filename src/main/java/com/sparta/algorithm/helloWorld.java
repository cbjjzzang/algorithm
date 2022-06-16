package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class helloWorld {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        int sum = 1;
        while (true){
            if( n == 1){
                cnt = 1;
                break;
            }
            sum += cnt * 6;
            if(n <= sum){
                cnt += 1;
                break;
            }
            cnt++;

        }
        System.out.println(cnt);
    }
}
