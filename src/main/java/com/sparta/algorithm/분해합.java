package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 분해합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n_lenth = br.readLine();
        int lenth = n_lenth.length();
        int n = Integer.parseInt(n_lenth);
        int fin = 0;
        for(int i = (n-(9*lenth)); i < n; i++){
            int target = i;
            int sum = 0;

            while(target != 0){
                sum += target%10;
                target /= 10;
            }

            if(i+sum == n){
                fin = i;
                break;
            }
        }
        System.out.println(fin);
    }
}
