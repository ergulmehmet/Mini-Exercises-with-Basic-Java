import java.util.Scanner;

public class DizilerdeSayiBulma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kaç adet sayı girmek istediğinizi yazınız : ");
        int adet = scan.nextInt();

        System.out.print("Lütfen " +adet+ " adet Sayı giriniz : ");
        int [] sayilar = new int[adet];
        int i;
        for (i = 0; i< sayilar.length; i++){
            sayilar[i] = scan.nextInt();
        }

        int sayiBul ;
        System.out.print("Lütfen bulmak istediğiniz sayıyı giriniz : ");
        sayiBul = scan.nextInt();

        boolean varMi = false;

        for (int sayi : sayilar){
            if(sayiBul==sayi){
                varMi = true;
                break;
            }
        }
        if(varMi){
            System.out.println("Girdiğiniz "+sayiBul+ " sayısı dizide bulunmaktadır.");
        }else{
            System.out.println("Girdiğiniz "+sayiBul+ " sayısı dizide bulunmamaktadır.");
        }







    }
}
