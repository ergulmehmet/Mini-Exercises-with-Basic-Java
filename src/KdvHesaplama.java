import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {
        double paraMiktari;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen para miktarinizi giriniz : ");
        double KdvsizFiyat = input.nextDouble();
        double KDVliFiyat = KdvsizFiyat + KdvsizFiyat*18/100;
        double KDVMiktari = KDVliFiyat - KdvsizFiyat;
        System.out.println("Ana Paraniz : "+KdvsizFiyat);
        System.out.println("KDVli Fiyat : "+KDVliFiyat);
        System.out.println("Toplam KDV miktari : "+KDVMiktari);
    }
}
