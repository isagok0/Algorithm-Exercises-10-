import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

       /* Scanner input = new Scanner(System.in);

        for (int i=0;i<=5;i++){
            System.out.println("Bir şeyler yazınız!");
            String yazi = input.nextLine();
            System.out.println(yazi);
            System.out.println('1');
            System.out.println('2');
            System.out.println('3');
        }
       */

      /*  Scanner input = new Scanner(System.in);
        System.out.println("Sayıları giriniz ?");
            int sayi ;
            int toplam = 0;


        for (int i=0;i<=9;i++) {
            System.out.println(i);

            sayi= input.nextInt();
            toplam += sayi;
        }
        System.out.println("Rakamların toplamı:" + toplam);
    }*/

        //1 ile 1000 arasında bu iki sayı dahil, 5 e bölünebilen kaç adet sayı vardır. Ardına aynı mantıkla
        // 5 e ve 7 ye bölünebilen kaç adet sayı vardır? bunu hesaplayan bir program.

        /*  int a = 5;
        int b = 7;
        int say5 = 0;
        int say7 = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % a == 0) {
                say5++;
                System.out.println(say5 + ": Sayı " + i + " 5'e tam bölünüyor");
            }
            if (i % b == 0) {
                say7++;
                System.out.println(say7 + ": Sayı " + i + " 7'ye tam bölünüyor");
            }

        }
        System.out.println("Toplam " + say5 + " tane 5'e tam bölünen sayı vardır.");
        System.out.println("Toplam " + say7 + " tane 7'ye tam bölünen sayı vardır.");


    }*/


     /*   int a = 5;
        int b = 7;
        int say5 = 0;
        int say7 = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % a != 0) {
                say5++;
                System.out.println(say5 + ": Sayı " + i + " 5'e tam bölünmeyen sayılar");
            }
            if (i % b != 0) {
                say7++;
                System.out.println(say7 + ": Sayı " + i + " 7'ye bölünmeyen sayılar");
            }

        }
        System.out.println("Toplam " + say5 + " tane 5'e tam bölünmeyen sayılar.");
        System.out.println("Toplam " + say7 + " tane 7'ye tam bölünmeyen sayılar.");

       */

        // kullanıcının girdiği 5 adet sayıdan kaçının 10 ile 20 arasında olduğunu söyleyen bir program.


      /*  Scanner input = new Scanner(System.in);

        System.out.println("Sayıları giriniz ?");

        int sayisayar = 0;


        for (int i = 0; i < 5; i++) {

            float sayi = input.nextFloat();

            if (sayi >= 10 && sayi <= 20) {
                sayisayar++;
            }


        }System.out.println("10 ile 20 arasındadır:" + sayisayar);
        input.close();
  */

        // Geçme notu 60 olan bir derste, öğrenciden 3 adet sınav notunu girilmesi
        // istenecek ve not ortalamasına göre geçtiği ya da kaldığı yazan bir program.

       /* Scanner input = new Scanner(System.in);

        System.out.println("Puanlarınızı giriniz ?");

        float toplam = 0;

        for (int i = 0; i < 3; i++) {
            float sayi = input.nextFloat();
            toplam += sayi;
        }

        float ortalama = toplam / 3;

        if (ortalama >= 60) {
            System.out.println("Dersi Geçtiniz");
        } else {
            System.out.println("Dersi Geçemediniz");
        }
        */

        //Geçme notu 45 olan bir derste, öğrenciden her bir vize bir final, 2 ödev notu isteyip geçip geçmediğini hesaplayan bir program.
        // vize yüzde 15, final yüzde 35, ödevlerin her biri de yüzde 25 olacak şekilde geçme notuna katkı sağlar.


       /*  Scanner input = new Scanner(System.in);

        System.out.println("Puanlarınızı giriniz?");

        float vizeToplam = 0;
        float finalToplam = 0;
        float odev1Toplam = 0;
        float odev2Toplam = 0;

        for (int i = 0; i < 1; i++) {
            float vize = input.nextFloat();
            vizeToplam += vize;
        }

        for (int i = 0; i < 1; i++) {
            float final1 = input.nextFloat();
            finalToplam += final1;
        }

        for (int i = 0; i < 1; i++) {
            float odev1 = input.nextFloat();
            odev1Toplam += odev1;
        }

        for (int i = 0; i < 1; i++) {
            float odev2 = input.nextFloat();
            odev2Toplam += odev2;
        }

        float ortalama = (vizeToplam*0.15f) + (finalToplam*0.35f) + (odev1Toplam*0.25f) + (odev2Toplam*0.25f);

        if (ortalama >= 45) {
            System.out.println("Dersi geçtiniz.");
        } else {
            System.out.println("Dersi geçemediniz.");
        }

       */


       /*
        for (int a = 1; a <= 10; a++) {
            for (int b = 1; b <= 10; b++) {
                System.out.println(a + " x " + b + " = " + (a * b));
            }
        }
       */

        //9) kullanıcının girdiği 10 sayıdan kaçının çift olduğunu ekrana yazdıran bir program.


       /* Scanner input = new Scanner(System.in);

        System.out.println("10 sayı giriniz?");

        int sayisayar = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            float sayi = input.nextFloat();

            if (sayi % 2 == 0) {
                sayisayar++;
                System.out.println("Sayı " + sayi + " çift sayıdır.");
            } else {
                System.out.println("Sayı " + sayi + " çift sayı değildir.");
            }

        }
        System.out.println("Girilen " + sayisayar + " sayı çift sayıdır.");

    }*/

        //1 ile 1000 arasında(bu sayılar dahil) , 7 'ye ve 9'a tam bölünebilen sayıların toplamını yazan bir program
         /* int toplam = 0 ;
        for (int i = 0; i <= 1000; i++) {


            if (i % 7 ==0   && i % 9 ==0 ) {

              toplam++;
            }


        }System.out.println(toplam); */

        //1 ile 1000 arasında(bu sayılar dahil) , 7 'ye ve 9'a tam bölünebilen sayıların toplamını yazan bir program

        int a = 7;
        int b = 9;
        int say7 = 0;
        int say9 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % a == 0) {
                say7++;
            }
            if (i % b == 0) {
                say9++;
            }
        }
        int toplam = say7 + say9;
        System.out.println("1 ile 1000 arasında 7 ve 9'a tam bölünebilen sayıların toplamı: " + toplam);



    }
}








