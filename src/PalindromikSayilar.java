import java.util.Scanner;

public class PalindromikSayilar {
    static int number,temp,lastNumber,reverseNumber;
    static boolean isPalindrom(int number){
         temp = number; reverseNumber=0;
        while (temp!=0){
            //System.out.println("Sayı = "+temp);
            lastNumber = temp %10;
           // System.out.println("Son Basamak = "+lastNumber);
            reverseNumber = (reverseNumber * 10)+lastNumber;
            //System.out.println("Yeni Sayı = "+reverseNumber);
            temp/=10;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
       int number = input.nextInt();

        isPalindrom(number);

        if (number==reverseNumber) {
            System.out.println("Girdiğiniz Sayı Palindromiktir.");
        } else {
            System.out.println("Girdiğiniz Sayı Palindromik Değildir");
        }
    }

}
