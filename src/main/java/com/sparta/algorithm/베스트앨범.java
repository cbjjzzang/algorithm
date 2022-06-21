package com.sparta.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        solution(genres, plays);
    }

    public static int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> genreMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
        }

        List<String> genreList = new ArrayList<>();

        while (!genreMap.isEmpty()){
            int a = 0;
            String t = "";
            for(String genre : genreMap.keySet()){
                if(a<genreMap.get(genre)){
                    a = genreMap.get(genre);
                    t = genre;
                }
            }
            genreMap.remove(t);
            genreList.add(t);

        }
        ArrayList<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < genreList.size(); i++){
            String g = genreList.get(i);

            int max = 0;
            int firstIdx = -1;
            for(int j = 0; j < genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j]){
                    max = plays[j];
                    firstIdx = j;
                }
            }

            max = 0;
            int secondInd = -1;
            for(int j = 0; j < genres.length; j++){
                if(g.equals(genres[j]) && max < plays[j] && j != firstIdx){
                    max = plays[j];
                    secondInd = j;
                }
            }
            answerList.add(firstIdx);
            if(secondInd >= 0) answerList.add(secondInd);
        }


        int[] answer = new int[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
