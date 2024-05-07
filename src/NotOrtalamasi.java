import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int Kimya;
        int Turkce;
        int Fizik;
        int Matematik;

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kimya dersinin notunu giriniz : ");
        Kimya = input.nextInt();


        System.out.println("Lütfen Turkce dersinin notunu giriniz : ");
        Turkce = input.nextInt();


        System.out.println("Lütfen Fizik dersinin notunu giriniz : ");
        Fizik = input.nextInt();


        System.out.println("Lütfen Matematik dersinin notunu giriniz : ");
        Matematik = input.nextInt();

        double notOrtalamasi = (Kimya + Turkce + Fizik + Matematik)/4;
        System.out.println("Notlarınızın ortalaması : "+notOrtalamasi+" dir");

        String sonuc = notOrtalamasi >= 70 ? "Geçti":"Kaldi";
        System.out.println(sonuc);



    }
}
