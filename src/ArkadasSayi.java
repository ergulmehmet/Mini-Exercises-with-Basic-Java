import java.util.Scanner;

public class ArkadasSayi {
    public static void main(String[] args) {
        //Kendisinden başka bölenler toplamı birbirine eşit olan sayılar

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number1 = scan.nextInt();
        System.out.print("Bir sayı daha giriniz : ");
        int number2 = scan.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        for (int i =1; i<number1; i++){
            if(number1%i==0){
                sum1+=i;
            }
        }
        for (int j =1; j<number2; j++){
            if(number2%j==0){
                sum2+=j;
            }
        }
        if (sum1==number2 && sum2==number1){
            System.out.println("Arkadaş sayıdır.");
        }else{
            System.out.println("Arkadaş sayı değildir.");
        }
    }
}
