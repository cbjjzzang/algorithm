package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> s = new ArrayList<>();

        for(int i = 0; i <n; i++){
            s.add(Integer.parseInt(st.nextToken()));
        }
        s.sort(Collections.reverseOrder());
        int sum = 0;

        for(int i = n; i > 0; i--){
            sum += i*s.get(i-1);
        }
        System.out.println(sum);
    }
}
