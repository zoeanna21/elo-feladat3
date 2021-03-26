package com.codecool.raceresults;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class RaceResult {

    static String calculateRacerResults(String fileName) {

        FileReader fr = null;
        BufferedReader reader = null;

        int bestResultSch = 300;
        int worstResultSch = 0;

        int bestResultCou = 300;
        int worstResultCou = 0;

        int bestResultHak = 300;
        int worstResultHak = 0;


        int bestResultYearSch = 0;
        int worstResultYearSch = 0;

        int bestResultYearCou = 0;
        int worstResultYearCou = 0;

        int bestResultYearHak = 0;
        int worstResultYearHak = 0;

        try{

            fr = new FileReader(fileName);
            reader = new BufferedReader(fr);



            while(true) {

                String line = reader.readLine();
                if(line == null) {
                    break;
                }

                if(Integer.parseInt(line.split(",")[0]) < bestResultSch) {
                    bestResultYearSch = Integer.parseInt(line.split(",")[3]);
                }
                if(Integer.parseInt(line.split(",")[0]) > worstResultSch) {
                    bestResultYearSch = Integer.parseInt(line.split(",")[3]);
                }

                if(Integer.parseInt(line.split(",")[1]) < bestResultCou) {
                    bestResultYearCou = Integer.parseInt(line.split(",")[3]);
                }
                if(Integer.parseInt(line.split(",")[1]) > worstResultCou) {
                    bestResultYearCou = Integer.parseInt(line.split(",")[3]);
                }

                if(Integer.parseInt(line.split(",")[2]) < bestResultHak) {
                    bestResultYearHak = Integer.parseInt(line.split(",")[3]);
                }
                if(Integer.parseInt(line.split(",")[2]) > worstResultHak) {
                    bestResultYearHak = Integer.parseInt(line.split(",")[3]);
                }




            }



        } catch(IOException e) {
            return "File not found!";
        }

        return  "Schumacher => " + bestResultYearSch + ", " + worstResultYearSch + " " +
                "Coultard => " + bestResultYearCou + ", " + worstResultYearCou + " " +
                "Hakkinen => " + bestResultYearHak + ", " + worstResultYearHak;

    }