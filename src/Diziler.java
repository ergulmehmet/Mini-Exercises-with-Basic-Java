import java.util.Arrays;

public class Diziler {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Ahmet";
        ogrenciler[1] = "Mehmet";
        ogrenciler[2] = "Ali";
        for (int i=0; i< ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        //foreach
        for (String ogrenci : ogrenciler){
            System.out.println(ogrenci);
        }

        System.out.println("=====================================");
        double toplam = 0;
        double[] arr = {1,5,8.5,4.2,7};
        for(double array : arr){
            toplam += array;
            System.out.println(array);
        }
        System.out.println("toplam = "+toplam);

        // Çoklu Diziler, Matris

        String[][] sehirler = new String[3][3];
        sehirler[0][0] = "Ankara";
        sehirler[0][1] = "İstanbul";
        sehirler[0][2] = "İzmir";
        sehirler[1][0] = "Adana";
        sehirler[1][1] = "Adıyaman";
        sehirler[1][2] = "Afyon";
        sehirler[2][0] = "Aksaray";
        sehirler[2][1] = "Amasya";
        sehirler[2][2] = "Antalya";
       for (int i =0; i<=2; i++){
           for (int j = 0; j<=2; j++){
               System.out.println(sehirler[i][j]);
           }
       }
       for (String[] sehir : sehirler){
           System.out.println(Arrays.toString(sehir));
       }

    }
}
