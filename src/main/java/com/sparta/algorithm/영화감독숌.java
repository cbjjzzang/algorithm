package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 영화감독숌 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a = 666;
        int b = 1;

        while (n != b){
            a++;

            if(String.valueOf(a).contains("666")){
                b++;
            }
        }
        System.out.println(a);
    }
}
