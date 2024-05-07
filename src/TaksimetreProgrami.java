import java.util.Scanner;

public class TaksimetreProgrami {
    public static void main(String[] args) {
        //Taksimetre km başına 2.20 tl
        //Minimum Ödenecek tutar 20tl, 20tl altında yine 20 tl alınacaktir
        //Taksimetre açiliş ücreti 10tl

        double km, ödenecekTutar, sabitCarpan=2.20, acilisTutar=10, minimumTutar=20;
        Scanner input = new Scanner(System.in);
        System.out.println("km giriniz : ");
        km = input.nextDouble();
        ödenecekTutar = acilisTutar + sabitCarpan*km;
        ödenecekTutar = (ödenecekTutar<=20)? minimumTutar : ödenecekTutar;
        System.out.println("Borcunuz : "+ödenecekTutar);




    }
}
