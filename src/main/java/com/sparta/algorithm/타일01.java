package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 타일01 {
    static int n;
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        arr = new int[1000001];

        for(int i = 3; i < arr.length; i++) {
            arr[i] = -1;
        }

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;

        int ss = function(n);
        System.out.println(ss);
    }

    static int function(int s) {

        if(arr[s] == -1) {
            arr[s] = (function(s-1) + function(s-2)) % 15746;
        }
        return arr[s];
    }
}
