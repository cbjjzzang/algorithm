package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 잃어버린괄호 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        int sum = 1000000;
        while(st.hasMoreTokens()){
            int m = 0;

            StringTokenizer st2 = new StringTokenizer(st.nextToken(), "+");
            while (st2.hasMoreTokens()){
                m += Integer.parseInt(st2.nextToken());
            }

            if(sum == 1000000){
                sum = m;
            }else{
                sum -= m;
            }
        }
        System.out.println(sum);

    }
}
