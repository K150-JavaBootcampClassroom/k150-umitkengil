import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int sayac=0,sayi=0;
        boolean flag=true;
        Random random = new Random();

        System.out.println("Sayı Tahmin Oyununa Hoşgeldiniz");

        while (flag){
            sayi = random.nextInt(500);
            System.out.println("sayı:"+sayi+"\n Kolay Gelsin...");


            if (sayi >= 50 && sayi <= 100)
            {
                sayac++;
                flag=false;
            }else{
                sayac++;
            }
            System.out.println("Sayıyı "+sayac+". adımda buldunuz");
        }


    }
}