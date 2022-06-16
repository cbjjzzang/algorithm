package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 가장긴증가하는부분수열2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        b[0] = a[0];
        int l = 1;
        for(int i = 1; i < n; i++){
            int key = a[i];

            if(b[l - 1] < key){
                l++;
                b[l-1] = key;
            }else{
                int start = 0;
                int end = l;
                while(start < end){
                    int mid = (start + end)/2;

                    if(b[mid] < key){
                        start = mid + 1;
                    }else{
                        end = mid;
                    }
                }
                b[start] = key;
            }
        }
        System.out.println(l);
    }
}
