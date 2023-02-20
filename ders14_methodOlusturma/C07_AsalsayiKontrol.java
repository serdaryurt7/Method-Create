package ders14_methodOlusturma;

public class C07_AsalsayiKontrol {

    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method oluşturun.

    public static void main(String[] args) {

        int sayi = 24;
        System.out.println(asalSayiKontrolEt(sayi)); //
        System.out.println(asalSayiKontrolEt(23));
        System.out.println(asalSayiKontrolEt(5674531));

    }

    public static String asalSayiKontrolEt(int sayi){

        String sonuc ="";

        for (int i = 2; i <= sayi-1 ; i++) {

            if (sayi % i == 0){

                sonuc = "Asal Değil";
                break;
            }
        }

        if (!sonuc.equals("Asal Değil")){

            sonuc = "Asal";
        }

        return sonuc;

    }

}
