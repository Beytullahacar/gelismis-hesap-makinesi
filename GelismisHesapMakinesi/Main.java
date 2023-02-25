package GelismisHesapMakinesi;

import java.util.Scanner;

public class Main {
        static void toplam(double a,double b){
            double result = a + b;
            System.out.println("Toplam : " + result);
        }
        static void cikar(double a,double b){
            double result = a - b;
            System.out.println("Çıkarma : " + result);
        }
        static void carp(double a, double b){
            double result = a*b;
            System.out.println("Çarpma : " + result);
        }
        static void bolme(double a,double b){
            if (b == 0){
                System.out.println("Bölen sayı 0 olamaz.");
            }
            double result = a / b;
            System.out.println("Bölüm : " + result);
        }
        static void usAlma(double a,double b){
            double result = 1;
            for (int i = 1; i <= b; i++){
                result *= a;
            }
            System.out.println("Üs İşlemi : " + result);
        }
        static void mod(double a,double b){
            double result = a % b;
            System.out.println("Mod İşlemi : " + result);
        }
        static void alanCevre(double a,double b){
            System.out.println("Çevresi : " + (2 * (a + b)));
            System.out.println("Alanı : " + (a * b));
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = """
                1 - Toplama İşlemi
                2 - Çıkarma İşlemi
                3 - Çarpma İşlemi
                4 - Bölme İşlemi
                5 - Üslü Sayı Hesaplama
                6 - Mod Alma
                7 - Dikdörtgen Alan ve Çevre Hesabı
                0 - Çıkış Yap""";
            System.out.println(menu);
            while(true){
                System.out.print("Bir işlem seçiniz : ");
                select = scan.nextInt();
                if (select == 0){
                    break;
                }
                System.out.print("İlk sayı : ");
                double a = scan.nextInt();
                System.out.print("İkinci sayı : ");
                double b = scan.nextInt();
                switch (select){
                    case 1 -> toplam(a,b);
                    case 2 -> cikar(a,b);
                    case 3 -> carp(a,b);
                    case 4 -> bolme(a,b);
                    case 5 -> usAlma(a,b);
                    case 6 -> mod(a,b);
                    case 7 -> alanCevre(a,b);
                    default -> System.out.println("Geçersiz bir işlem girdiniz.");
                }
            }
            System.out.println("Çıkış yaptınız.");
        }

}
