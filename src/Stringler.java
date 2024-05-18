public class Stringler {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel. ";
        System.out.println(mesaj);
        System.out.println("Eleman sayısı : "+mesaj.length());
        System.out.println("5. Eleman Sayısı : "+mesaj.charAt(4));
        System.out.println(mesaj.concat("Yaşasın!"));

        if (mesaj.startsWith("A")){
            System.out.println("Cümle A ile başlıyor.");
        } else {
            System.out.println("Cümle A ile başlamıyor.");
        }
        char[] karakterler = new char[5];
        mesaj.getChars(0,5,karakterler,0);
        System.out.println(karakterler);

       int h = mesaj.indexOf("h");
        System.out.println(h);

        System.out.println(mesaj.replace(' ', '-'));
        // substring baştan kaç yazdıysak kes
        System.out.println(mesaj.substring(2,4));

        //trim baştaki ve sondaki boşlukları siler

    }
}
