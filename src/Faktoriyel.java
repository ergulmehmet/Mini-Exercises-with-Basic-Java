import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        //n! = 1 * 2 * 3 * 4 * 5 *....*n

        long k, i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        k = input.nextLong();
        long total = 1;

        for (i = 1; i <= k; i++) {
            total = total * i;
        }
        System.out.println(k+" Faktoriyel = "+total);

    }
}
