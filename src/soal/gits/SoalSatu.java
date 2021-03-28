/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.gits;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SoalSatu {

    //random lib
    Random rand = new Random();

    List<Integer> input = new ArrayList<Integer>();

    //Set Array length from randomNum
    public int[] pushtoArray(int length, int listNum[]){
        for(int i = 0; i < length; i++){
            int setRandomValue = rand.nextInt((1-0)+1);
            input.add(setRandomValue);
            listNum[i]= setRandomValue;
        }
        return listNum;
    }

    public static void main(String[] args) {

        //Get all Object and method in Class
        SoalSatu params = new SoalSatu();

        //All variables

        //Random Array lenght (min 1 max 10000)
        int randomNum = params.rand.nextInt((10000 - 1) + 1) + 1;

        //Main variables
        int listNum[] = new int[randomNum];
        List<Integer> input = new ArrayList<Integer>();

        //Input
        int listNum2[] = params.pushtoArray(randomNum, listNum);

        int hasil = 0;
        int count0 = 0;

        //Output
        int maksimum;

        //Classification random value in listNum
        for (int i = 0; i < listNum2.length; i++){
            if(listNum2[i] == 1){
                hasil = hasil + 1;
            }else if(hasil != 0 && listNum2[i] == 0){
                input.add(hasil);
                hasil = 0;
                count0 = count0 + 1;
            } else {
                hasil = 0;
                count0 = count0 + 1;
            }
        }

        maksimum = 0;

        //Set output
        for(Integer data : input) {
            if (data > maksimum){
                maksimum = data;
            }
        }

        //Print input and output
        System.out.println("Input :" + params.input);
        System.out.println("Output : "+maksimum);

    }
}