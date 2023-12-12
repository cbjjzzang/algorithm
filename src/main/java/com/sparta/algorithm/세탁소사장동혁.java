package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 세탁소사장동혁 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());


        for(int i = 0; i < n; i++) {
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int m = Integer.parseInt(br.readLine());
            while (m >= 25) {
                a = m / 25;
                m = m % 25;
            }
            while (m >= 10) {
                b = m / 10;
                m = m % 10;
            }
            while (m >= 5) {
                c = m / 5;
                m = m % 5;
            }
            d = m;
            System.out.println(a + " " + b + " " + c + " " + d);
        }

    }
}
