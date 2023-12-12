package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 알파벳찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        int[] arr2 = new int[26];
        for(int i = 0; i < 26; i++) {
            arr2[i] = -1;
        }
        String s = br.readLine();


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < s.length(); j++) {
                if(arr[i].equals(s.substring(j, j+1))) {
                    arr2[i] = j;
                    break;
                }
            }
        }
        for(int a : arr2) {
            System.out.print(a + " ");
        }
    }
}