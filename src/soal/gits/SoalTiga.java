/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal.gits;

import java.util.*;

public class SoalTiga {

    Scanner scan = new Scanner(System.in);
    List<String> input = new ArrayList<String>();
    Integer params;

    public void length(Integer length){
        if(length%2 != 0){
         System.out.println("Nilai tidak boleh ganjil");
         System.out.println("Masukan panjang Array (genap) : ");
         Integer nilaiAkhir = scan.nextInt();
         length(nilaiAkhir);
     } else {
         System.out.println("Lanjut");
         params = length;
         input(length);
     }
    }

    public void input(Integer jumlah){
        if(jumlah > 0){
            System.out.println("Masukan karakter ( '[',']','{','}','(',')' ) : ");
            String character =  scan.nextLine();
            switch (character){
                case "[" :
                    input.add(character);
                    input(--jumlah);
                    break;
                case "]" :
                    input.add(character);
                    input(--jumlah);
                    break;
                case "(" :
                    input.add(character);
                    input(--jumlah);
                    break;
                case ")" :
                    input.add(character);
                    input(--jumlah);
                    break;
                case "{" :
                    input.add(character);
                    input(--jumlah);
                    break;
                case "}" :
                    input.add(character);
                    input(--jumlah);
                    break;
                default:
                    System.out.println("Input tidak sesuai format");
                    input(jumlah);
            }
        } else{
            System.out.println("input : " + input);
        }
    }

    public static void main(String[] args) {

        List<Integer> nilai = new ArrayList<Integer>();
        List<Integer> checkAkhir = new ArrayList<Integer>();
        SoalTiga soalTiga = new SoalTiga();
        Scanner scan = new Scanner(System.in);
        String output;
        Integer nilaiAkhir = 0;
        Integer param;

        System.out.println("Masukan panjang Array (genap) : ");
        Integer length = scan.nextInt();

        soalTiga.length(length);

        for (String hasil : soalTiga.input){
            switch (hasil){
                case "[" :
                    nilai.add(3);
                    break;
                case "]" :
                    nilai.add(5);
                    break;
                case "(" :
                    nilai.add(2);
                    break;
                case ")" :
                    nilai.add(6);
                    break;
                case "{" :
                    nilai.add(1);
                    break;
                case "}" :
                    nilai.add(7);
                    break;
                default:
                    break;
            }
        }


        Integer panjangNilai = nilai.size()/2;

        for(Integer i = 0; i < soalTiga.params; i++){
            nilaiAkhir = nilaiAkhir + nilai.get(i);
        }

        if(nilaiAkhir % 8 != 0){
//                output = "NO";
//                System.out.println("Output : "+output);
        } else {
//            if (nilai.size() == 2){
//                if (nilai.get(0) + nilai.get(nilai.size()-1) == 8){
//                    output = "YES";
//                    System.out.println("Output : "+output);
//                } else {
//                    output = "NO";
//                    System.out.println("Output : "+output);
//                }
//            } else if (nilai.size() == 4){
//                if ((nilai.get(0) + nilai.get(nilai.size()-1) == 8 || nilai.get(0) + nilai.get(0+1) == 8) &&
//                        (nilai.get(1) + nilai.get(nilai.size()-2) == 8 || nilai.get(2) + nilai.get(0+3) == 8) ){
//                    output = "YES";
//                    System.out.println("Output : "+output);
//                } else {
//                    output = "NO";
//                    System.out.println("Output : "+output);
//                }
//            } else if (nilai.size() == 6){
//                if (nilai.get(0) + nilai.get(nilai.size()-1) == 8 || nilai.get(0) + nilai.get(0+1) == 8 || nilai.get(0) + nilai.get(0+3) == 8){
//                    if (nilai.get(1) + nilai.get(0) == 8 || nilai.get(1) + nilai.get(0+2) == 8 || nilai.get(1) + nilai.get(0+4) == 8){
//                        if (nilai.get(2) + nilai.get(nilai.size()-3) == 8 || nilai.get(2) + nilai.get(0+1) == 8 || nilai.get(2) + nilai.get(0+5) == 8){
//                            output = "YES";
//                            System.out.println("Output : "+output);
//                        } else {
//                            output = "NO";
//                            System.out.println("Output : "+output);
//                        }
//                    } else{
//                        output = "NO";
//                        System.out.println("Output : "+output);
//                    }
//                } else {
//                    output = "NO";
//                    System.out.println("Output : "+output);
//                }
//            }
            for(Integer i = 0; i < nilai.size(); i++ ){
                param = 1;
                for(Integer b = 0; b<nilai.size()/2; b++ ){
                    if(i == 0){
                        if(nilai.get(i) + nilai.get(i+param) == 8){
                            checkAkhir.add(8);
                        }
                        param = param + 2;
                    } else {
                        if(i + param < nilai.size()){
                            if(nilai.get(i) + nilai.get(i+param) == 8){
                                checkAkhir.add(8);
                            }
                            param = param + 2;
                        }
//                        else {
//                            Integer param2 = 1;
//                            if(nilai.get(i) + nilai.get(i-param2) == 8){
//                                System.out.println(nilai.get(i));
//                                System.out.println(nilai.get(i-param2));
//                                checkAkhir.add(8);
//                            }
//                            param2 = param + 2;
//                        }
                    }
                }
            }
        }

        if(checkAkhir.size() >= nilai.size()/2){
            output = "YES";
            System.out.println("Output : "+output);
        } else {
            output = "NO";
            System.out.println("Output : "+output);
        }

    }
}
