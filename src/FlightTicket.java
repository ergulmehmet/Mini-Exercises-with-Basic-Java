import java.util.Scanner;

public class FlightTicket {
    public static void main(String[] args){
        double total ;
        double pricePerKm = 0.1;
        double lastPayment;
        while(true){
            Scanner scan = new Scanner(System.in);

            System.out.print("Lütfen yolculuğun mesafesini km cinsinden giriniz : ");
            double distance = scan.nextDouble();
            if (distance<0){
                System.out.println("Mesafe sıfırdan küçük olamaz!");
                continue;
            }

            total = distance*pricePerKm;
            System.out.print("Lütfen yaşınızı giriniz : ");
            int age = scan.nextInt();
            if (age<0){
                System.out.println("Yaş sıfırdan küçük olamaz!");
                continue;
            }
            System.out.print("Lütfen yolculuk tipini seçiniz : Tek yön için '1'e, Gidiş Dönüş için '2'ye basınız.");
            int type = scan.nextInt();
            if (type == 1){
                System.out.println("Tek yön yolculuğu");
            } else if (type == 2){
                System.out.println("Gidiş Dönüş yolculuğu");
            } else {
                System.out.println("Yanlış giriş yaptınız! Sadece 1 veya 2ye basınız");
                continue;
            }
            if (age<12){
                System.out.println("%50 indirim uygulandı!");
                lastPayment = total - (total/2);
            } else if (age>12 && age<24) {
                System.out.println("%10 indirim uygulandı!");
                lastPayment = total - (total/10);
            }else if (age>65) {
                System.out.println("%30 indirim uygulandı!");
                lastPayment = total - (total*3/10);
            }
            else {
                lastPayment = total;
            }
            if (type == 2){
                lastPayment = lastPayment -(lastPayment/5);
                System.out.println("%20 indirim uygulandı!");
                System.out.println("Toplam ödenecek tutar : " + lastPayment*2);
            } else {
                System.out.println("Toplam ödenecek tutar : " + lastPayment);
            }
            break;
        }
    }
}
