import Bazaar.Concrete.Apple;
import Bazaar.Concrete.Cherry;
import Bazaar.Concrete.Pear;
import User.Admin;
import User.Customer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Admin ve Customer nesneleri oluşturulup, rolleri verildi


        Admin admin = new Admin();
        admin.setRole("Admin");

        Customer customer = new Customer();
        customer.setRole("Customer");

        Scanner input = new Scanner(System.in); //dışardan sayı almak için

        if(customer instanceof Customer){ //customer doğrulama
            Apple apple = new Apple();//örnek veri girişi, çoğaltılabilir
            System.out.println("100 kilo elma");
            System.out.println("10 kilo seçtiniz");
            apple.kg(10);
            double s1 = apple.stock(100- apple.kg(10));//alım sonrası depoda kalan miktar
            System.out.println("depoda "+s1+" kadar elma kaldı");

        }else{ //kişi admin ise
            System.out.println("hoşgeldin admin");
            System.out.println("Depoları güncellemek için 1 e bas");
            int choose=input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Elma deposu güncelle");
                    Apple apple = new Apple();
                    double stokElma = input.nextDouble();
                    apple.stock(stokElma);
                    System.out.println("Güncellenen Elma Deposu"+apple.stock(stokElma));
                    break;
                case 2:
                    System.out.println("Armut deposu güncelle");
                    Pear pear = new Pear();
                    double stokArmut = input.nextDouble();
                    pear.stock(stokArmut);
                    System.out.println("Güncellenen Elma Deposu"+pear.stock(stokArmut));
                    break;
                case 3:
                    System.out.println("Kiraz deposu güncelle");
                    Cherry cherry = new Cherry();
                    double stokKiraz = input.nextDouble();
                    cherry.stock(stokKiraz);
                    System.out.println("Güncellenen Elma Deposu"+cherry.stock(stokKiraz));
                    break;
                default:
                    System.out.println("Geçersiz Seçim Çıkış Yapıldı");
            }

        }





        System.out.println("Hello world!");
    }
}