package com.sparta.algorithm;

import java.util.HashSet;
import java.util.Iterator;

public class 위장 {
    public static void main(String[] args) {

    }

    public static int solution(String[][] clothes) {
        int answer = 1;
        HashSet<String> arr = new HashSet<>();

        for(String[] a : clothes){
            arr.add(a[1]);
        }

        Iterator<String> types = arr.iterator();

        while (types.hasNext()){
            int cnt = 0;
            String t = types.next();
            for(String[] b : clothes){
                if(b[1].equals(t)){
                    cnt++;
                }
            }
            answer = answer * (cnt+1);
        }

        return answer-1;
    }
}
