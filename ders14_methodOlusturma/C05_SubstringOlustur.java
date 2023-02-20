package ders14_methodOlusturma;

public class C05_SubstringOlustur {

    // Soru 1- Kullanicidan input olarak bir String alın,
    // baslangic ve bitis indexlerine gore baslangic index'i dahil, bitis index'i haric olacak sekilde
    // aradaki harfleri yazdiran bir method olusturun.
    // - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata mesaji verin
    // - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji yazdirin.

    public static void main(String[] args) {

        String input = "Java ne kadar guzel";
        int baslangicIndexi = 5;
        int bitisIndexi = 7;

        kendiSubstringMethodumuz(input,baslangicIndexi,bitisIndexi);
        kendiSubstringMethodumuz("Java",1,3);
        kendiSubstringMethodumuz("Deneme",6,3);
        kendiSubstringMethodumuz("Java",6,8);
    }

    public static void kendiSubstringMethodumuz(String input, int baslangicIndexi, int bitisIndexi){


        if (baslangicIndexi > bitisIndexi){

            System.out.println("Başlangıç indexi, bitiş indexinden büyük olamaz.");
        } else if (bitisIndexi >= input.length()) {

            System.out.println("Bitiş indexi String'in sınırları dışında.");
        }

        else {

            //      baslangic ve bitis indexlerine gore baslangic index'i dahil,
            //      bitis index'i haric olacak sekilde
            //      aradaki harfleri yazdiran bir method olusturun.

            for (int i = baslangicIndexi; i < bitisIndexi ; i++) {

                System.out.print(input.charAt(i));

            }
            System.out.println();

        }


    }
}
