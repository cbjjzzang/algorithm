package com.sparta.algorithm;

public class Solution {

    public String solution(String m, String[] musicinfos){
        String answer = "";
        int mostPlayTime = 0;

        m = changeChar(m);

        for(String musicinfo : musicinfos){
            String[] info = musicinfo.split(",");
            String melody = changeChar(info[3]);
            String title = info[2];
            String[] start = info[0].split(":");
            String[] end = info[1].split(":");

            int hour = (Integer.parseInt(end[0]) - Integer.parseInt(start[0])) * 60;
            int min = Integer.parseInt(end[1]) - Integer.parseInt(start[1]) + hour;

            if(min > melody.length()){
                StringBuilder stringBuilder = new StringBuilder();
                for(int i = 0; i < min / melody.length(); i++){
                    stringBuilder.append(melody);
                }
                String newMelody = melody.substring(0, min % melody.length());
                stringBuilder.append(newMelody);
                melody = stringBuilder.toString();
            }else{
                melody = melody.substring(0, min);
            }

            if(melody.contains(m) && min > mostPlayTime){
                answer = title;
                mostPlayTime = min;
            }
        }
        if(mostPlayTime != 0){
            return answer;
        }else {
            return "(None)";
        }

    }

    public String changeChar(String melody){
        melody = melody.replaceAll("C#", "c");
        melody = melody.replaceAll("D#", "d");
        melody = melody.replaceAll("F#", "f");
        melody = melody.replaceAll("G#", "g");
        String newMelody = melody.replaceAll("A#", "a");

        return newMelody;
    }
}
