package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 영단어암기는어려워 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<String, Integer> map = new TreeMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            if(s.length() >= m) {
                if(!map.containsKey(s)) {
                    map.put(s, 1);
                } else {
                    map.put(s, map.get(s) + 1);
                }
            }
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((Comparator.comparingInt(String::length).reversed()));
        list.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        StringBuilder sb = new StringBuilder();
        for(String ss : list) {
            sb.append(ss).append('\n');
        }
        System.out.println(sb);
    }
}
