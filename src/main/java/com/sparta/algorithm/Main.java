package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while(true){
            if(t == 0){
                break;
            }
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int num = (x2 - x1)*(x2 - x1)+(y2-y1)*(y2-y1);

            int cnt;

            if(x1 == x2 && y1 == y2 && r1 == r2){
                cnt = -1;
            }else if(num > (r2+r1)*(r2+r1)){
                cnt = 0;
            }else if(num < (r2-r1)*(r2-r1)){
                cnt = 0;
            }else if(num == (r2+r1)*(r2+r1)){
                cnt = 1;
            }else if(num == (r2-r1)*(r2-r1)){
                cnt = 1;
            }else{
                cnt = 2;
            }
            System.out.println(cnt);
            t--;
        }
    }
}


