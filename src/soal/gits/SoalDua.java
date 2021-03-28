/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.gits;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SoalDua {

    Scanner scan = new Scanner(System.in);
    List<Character> params = new ArrayList<Character>();
    List<Character> hasil = new ArrayList<Character>();

    public void read(Integer jumlah){
        if (jumlah > 0){
            hasil.add(params.get(jumlah-1));
            read(--jumlah);
        } else  {
            System.out.println("Output :" + hasil);
        }
    }

    public void input(Integer jumlah){
        if(jumlah > 0){
        System.out.println("Masukan karakter : ");
        Character character =  scan.next().charAt(0);
        params.add(character);
        input(--jumlah);
        } else{
            System.out.println("input : " + params);
            read(params.size());
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        SoalDua soalDua = new SoalDua();

        System.out.println("Masukan Jumlah Karakter : ");
        Integer jumlah = scan.nextInt();

        soalDua.input(jumlah);

    }
}