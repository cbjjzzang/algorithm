package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 계단오르기 {

    static int[] stair;
    static int[] score;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        stair = new int[301];
        score = new int[301];

        for(int i = 1; i <= n; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
        score[1] = stair[1];
        score[2] = stair[1] + stair[2];
        score[3] = Math.max(stair[1], stair[2]) + stair[3];

        for(int i = 4; i <= n; i++){
            score[i] = Math.max(score[i-2], score[i-3] + stair[i-1]) + stair[i];
        }
        System.out.println(score[n]);
    }
}
