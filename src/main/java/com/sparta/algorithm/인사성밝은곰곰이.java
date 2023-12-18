package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class 인사성밝은곰곰이 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int sum = 0;
        Set<String> set = new HashSet<>();
        br.readLine();
        for(int i = 0; i < a-1; i++) {
            String s = br.readLine();
            if(s.equals("ENTER")) {
                sum += set.size();
                set = new HashSet<>();
            } else {
                set.add(s);
            }
        }
        sum += set.size();
        System.out.println(sum);
    }
}
