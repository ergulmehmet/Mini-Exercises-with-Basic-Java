import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {


        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz: ");
       password = input.nextLine();
       if (userName.equals("java")&&password.equals("memo123")){
           System.out.println("Giriş Yaptınız.");

       }else {
           System.out.println("Bilgileriniz Yanlış");
       }




    }
}
