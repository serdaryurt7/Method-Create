package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {

        // main method icerisinde kullanicidan iki sayi alin
        // bu iki sayiyi parametre olarak kabul edip, carpimlarini bize donduren bir method olusturun


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lüften iki sayi giriniz");
        double sayi1 = scanner.nextDouble(); // 5
        double sayi2 = scanner.nextDouble(); // 3

        System.out.println(carpimMethodu(sayi1, sayi2)); // 15.0

        double carpimSonucu = carpimMethodu(6,2);

    }


    public static double carpimMethodu(double sayi1, double sayi2){

        System.out.println("carpim methodu calisti");
        return sayi1 * sayi2;

    }


}
