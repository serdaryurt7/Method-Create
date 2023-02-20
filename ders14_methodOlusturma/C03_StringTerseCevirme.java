package ders14_methodOlusturma;

public class C03_StringTerseCevirme {

    // parametre olarak bir string kabul edip, stringi terse çevrilmiş halini döndüren bir method oluşturun.

    public static void main(String[] args) {

        String input = "java kod yazdıkça öğrenilir";

        System.out.println(stringiTerseCevir(input));

        String tersMetin = stringiTerseCevir("Serdar");

        System.out.println(tersMetin);


    }


    public static String stringiTerseCevir(String input){

        String tersStr = "";

        for (int i = input.length()-1; i >= 0 ; i--) {

            tersStr = tersStr + input.charAt(i);

        }

        return tersStr;

    }


}
