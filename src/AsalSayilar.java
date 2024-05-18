import java.util.Scanner;

public class AsalSayilar {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz : ");
        sayi = input.nextInt();
        boolean isPrime =true;
        for (int i = 2; i < sayi; i++) {
           if (sayi % i == 0){
               isPrime = false;
               System.out.println("Asal değildir");
               break;
           }
        }
        if (isPrime){
            System.out.println("Asal sayıdır");
        }
    }
}
