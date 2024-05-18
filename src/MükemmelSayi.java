import java.util.Scanner;

public class MükemmelSayi {
    public static void main(String[] args) {

        //Kendisinden başka tüm bölenler toplamı kendisine eşitse mükemmel sayıdır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam=0;

        for (int i = 1; i<sayi; i++){
            if(sayi%i==0){
                toplam +=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+" Mükemmel sayıdır.");
        }else {
            System.out.println(sayi+" Mükemmel Sayı Değildir");
        }

    }
}
