package com.sparta.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 이공사팔 {
    static int n;
    static int[][] arr;
    static int[] com = new int[5];
    static int max = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dfs(0);
        System.out.println(max);

    }

    static void dfs(int depth) {
        if(depth == 5) {
            int[][] newArr = new int[n][n];

            for(int i = 0; i < n; i++) {
                System.arraycopy(arr[i], 0, newArr[i], 0, n);
            }

            for(int i = 0; i < 5; i++) {
                int s = com[i];
                swipe(s, newArr);
            }

            int num = 0;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    num = Math.max(newArr[i][j], num);
                }
            }

            max = Math.max(num, max);
            return;
        }

        for(int i = 0; i < 4; i++) {
            com[depth] = i;
            dfs(depth + 1);
        }
    }

    static void swipe(int idx, int[][] newArr) {
        switch (idx) {
            case 0 : // 상
                for(int i = 0; i < n; i++) {
                    int index = 0;
                    int block = 0;
                    for(int j = 0; j < n; j++) {
                        if(newArr[j][i] != 0) {
                            if(newArr[j][i] == block) {
                                newArr[index - 1][i] = block * 2;
                                block = 0;
                                newArr[j][i] = 0;
                            } else {
                                block = newArr[j][i];
                                newArr[j][i] = 0;
                                newArr[index][i] = block;
                                index++;
                            }
                        }
                    }
                }
                break;
            case 1 : // 우
                for(int i = 0; i < n; i++) {
                    int index = n-1;
                    int block = 0;
                    for(int j = n - 1; j >= 0; j--) {
                        if(newArr[i][j] != 0) {
                            if(newArr[i][j] == block) {
                                newArr[i][index + 1] = block * 2;
                                block = 0;
                                newArr[i][j] = 0;
                            } else {
                                block = newArr[i][j];
                                newArr[i][j] = 0;
                                newArr[i][index] = block;
                                index--;
                            }
                        }
                    }
                }
                break;
            case 2 : // 하
                for(int i = 0; i < n; i++) {
                    int index = n-1;
                    int block = 0;
                    for(int j = n - 1; j >= 0; j--) {
                        if(newArr[j][i] != 0) {
                            if(newArr[j][i] == block) {
                                newArr[index + 1][i] = block * 2;
                                block = 0;
                                newArr[j][i] = 0;
                            } else {
                                block = newArr[j][i];
                                newArr[j][i] = 0;
                                newArr[index][i] = block;
                                index--;
                            }
                        }
                    }
                }
                break;
            case 3 : // 좌
                for(int i = 0; i < n; i++) {
                    int index = 0;
                    int block = 0;
                    for(int j = 0; j < n; j++) {
                        if(newArr[i][j] != 0) {
                            if(newArr[i][j] == block) {
                                newArr[i][index - 1] = block * 2;
                                block = 0;
                                newArr[i][j] = 0;
                            } else {
                                block = newArr[i][j];
                                newArr[i][j] = 0;
                                newArr[i][index] = block;
                                index++;
                            }
                        }
                    }
                }
                break;
        }
    }
}
