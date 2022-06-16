package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 블랙잭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] list = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        int temp = 0;
        for(int i = 0; i< n-2; i++){
            if(list[i] > m)
                continue;
            for(int j = i+1; j < n-1; j++){
                if(list[i] + list[j] > m)
                    continue;
                for(int k = j+1; k < n; k++){
                    temp = list[i] + list[j] + list[k];

                    if(temp == m) {
                        sum = temp;
                        break;
                    }

                    if(sum < temp && temp < m){
                        sum = temp;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
