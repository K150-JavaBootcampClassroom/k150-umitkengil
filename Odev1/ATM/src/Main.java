import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ATM ye Hoş Geldiniz");

        double deposit = 500.000;

        System.out.println("Lütfen İşlem Türünü Seçiniz:");
        System.out.println("\n 1. Para Çekme\n 2. Para Yatırma\n 3. Bakiye Öğrenme\n 4. Çıkış");

        Scanner opTypeKeyboard = new Scanner(System.in);
        System.out.print("Lütfen İşlem Türü Seçiniz:");
        int op_Type = opTypeKeyboard.nextInt();

        switch (op_Type)
        {
            case 1:
                System.out.print("Lütfen Çekmek İstediğiniz Tutarı Giriniz:");
                double moneyOut = opTypeKeyboard.nextDouble();
                System.out.println("Çekmek istediğiniz tutar: "+moneyOut+" TL");

                if(deposit>=moneyOut) {
                    deposit = deposit-moneyOut;
                    System.out.println("Çekilen Tutar: "+moneyOut+" TL");
                    System.out.println("Kalan Bakiye: "+deposit+" TL");

                }
                else {
                    System.out.println("Çekmek İstediğiniz tutar bakiyenizden yüksektir:");
                    System.out.println("Bakiyeniz:"+deposit +" Çekmek istediğiniz Tutar: "+moneyOut+" TL");
                    System.out.println("İşlem Sonlandırıldı.");

                }
                break;
            case 2:
                System.out.print("Lütfen Yatırmak İstediğiniz Tutarı Giriniz:");
                double moneyIn = opTypeKeyboard.nextDouble();
                System.out.println("Yatırmak istediğiniz tutar: "+moneyIn+" TL");
                deposit+=moneyIn;
                System.out.println("Son Bakiye:"+deposit+" TL");
                break;
            case 3:
                System.out.println("Güncel Bakiyeniz:"+deposit+" TL");
                break;
            case 4:
                System.out.println("Çıkış İçin {0} a tıklayın.");
                int exit = opTypeKeyboard.nextInt();
                if(exit==0){
                    System.out.println("Çıkış Yapıldı");
                }else{
                    System.out.println("Geçersiz İşlem");
                }
                break;
            default:
                System.out.println("Geçersiz Seçim");
        }

    }
}