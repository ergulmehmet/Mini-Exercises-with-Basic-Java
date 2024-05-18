import java.util.Scanner;

public class TriangleWithStars {
    public static void main(String[] args) {
        int i;
        int j;
        int satirSayisi;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç satırlı bir üçgen olmasını istiyorsunuz: ");
        satirSayisi = scan.nextInt();
        for ( i =0; i<satirSayisi; i++){
            for ( j =0; j<satirSayisi-i; j++){
                System.out.print("* ");
            }
            System.out.println("\t");
        }
        System.out.println("======================================");

        for ( i =0; i<satirSayisi; i++){
            String bosluk = " ".repeat(i);
            System.out.print(bosluk);
            for ( j =0; j<satirSayisi-i; j++){

                System.out.print("* ");
            }
            System.out.println("\t");
        }
        System.out.println("======================================");
        for ( i =0; i<satirSayisi; i++){
            String bosluk = " ".repeat(i*2);
            System.out.print(bosluk);
            for ( j =0; j<satirSayisi-i; j++){

                System.out.print("* ");
            }
            System.out.println("\t");
        }
        System.out.println("======================================");
        for ( i =satirSayisi; i>0; i--){
            String bosluk = " ".repeat(i);
            System.out.print(bosluk);
            for ( j =0; j<satirSayisi+1-i; j++){

                System.out.print("* ");
            }
            System.out.println("\t");
        }


    }
}
