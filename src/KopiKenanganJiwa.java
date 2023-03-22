import java.util.Random;
import java.util.Scanner;

public class KopiKenanganJiwa {
    int namaKopi = 4;
    public static String[] KopiLateDontBeLate = new String[400];
    public static String[] KopiGoncangJiwa = new String[300];
    public static String[] KopiJalanKenangan = new String[300];
    public static String[] KopiPahitTanpaRasa = new String[250];

    public static void pembeli(String[] myArray, String Pembeli){
        int IndexNow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null) {
                IndexNow = index + 1;
            }
        }
        if (IndexNow < myArray.length) {
            myArray[IndexNow] = Pembeli;
        }
    }
    static int stock = KopiGoncangJiwa.length+KopiPahitTanpaRasa.length+KopiJalanKenangan.length+KopiPahitTanpaRasa.length;
    static int sisaKopi = stock;

    public static void jumlahKopiTerbanyak(String pembeli, int angka){

        switch (angka) {
            case 1 -> {
                pembeli(KopiLateDontBeLate, pembeli);
                System.out.println("Pembeli memesan kopi Late dont Be Latte");
            }
            case 2 -> {
                pembeli(KopiGoncangJiwa, pembeli);
                System.out.println("Pembeli memesan kopi Kopi Goncang Jiwa");
            }
            case 3 -> {
                pembeli(KopiJalanKenangan, pembeli);
                System.out.println("Pembeli memesan kopi Kopi Jalan Kenangan");
            }
            case 4 -> {
                pembeli(KopiPahitTanpaRasa, pembeli);
                System.out.println("Pembeli memesan kopi Kopi Pahit Tanpa Rasa");
            }
        }
        int totalSisaKopi = 0;
        int jumlahKopiLateDontBeLate = 0;
        for (int i=0; i<KopiLateDontBeLate.length; i++){
            if(KopiLateDontBeLate[i] != null){
                jumlahKopiLateDontBeLate++;
            }
        }
        int jumlahKopiKopiGoncangJiwa = 0;
        for (int i=0; i<KopiGoncangJiwa.length; i++){
            if(KopiGoncangJiwa[i] !=null){
                jumlahKopiKopiGoncangJiwa++;
            }
        }
        int jumlahKopiJalanKenangan = 0;
        for (int i=0; i<KopiJalanKenangan.length; i++){
            if(KopiJalanKenangan[i] !=null){
                jumlahKopiJalanKenangan++;
            }
        }
        int jumlahKopiPahitTanpaRasa = 0;
        for (int i=0; i<KopiPahitTanpaRasa.length; i++){
            if(KopiPahitTanpaRasa[i] !=null){
                jumlahKopiPahitTanpaRasa++;
            }
        }

        sisaKopi = stock - jumlahKopiLateDontBeLate - jumlahKopiKopiGoncangJiwa - jumlahKopiJalanKenangan - jumlahKopiPahitTanpaRasa;
        System.out.println("==========Data Penjualan==========");
        System.out.println("Don't Be Late       : "+jumlahKopiLateDontBeLate+" | Sisa Stok Kopi Don't Be Late    : "+(KopiLateDontBeLate.length-jumlahKopiLateDontBeLate));
        System.out.println("Goncang Jiwa        : "+jumlahKopiKopiGoncangJiwa+" | Sisa Stok Kopi Goncang Jiwa     : "+(KopiGoncangJiwa.length-jumlahKopiKopiGoncangJiwa));
        System.out.println("Jalan Kenangan      : "+jumlahKopiJalanKenangan+" | Sisa Stok Kopi Jalan Kenangan   : "+(KopiJalanKenangan.length-jumlahKopiJalanKenangan));
        System.out.println("Pahit Tanpa Rasa    : "+jumlahKopiPahitTanpaRasa+" | Sisa Stok Kopi Pahit Tanpa Rasa : "+(KopiPahitTanpaRasa.length-jumlahKopiPahitTanpaRasa));
    }

    public static void pesan (){
        Scanner inputData= new Scanner(System.in);
        while(true){
            System.out.println("Nama Pembeli: ");
            String namaPembeli = inputData.nextLine();
            if(namaPembeli.isEmpty()){
                System.out.println("Nama Pembali Wajib Diisi");
                pesan();
            }else{
                Random hasil = new Random();
                int JenisRandom = hasil.nextInt(4)+1;
                jumlahKopiTerbanyak(namaPembeli,JenisRandom);
            }
        }
    }

    public static void main(String[] args) {
        pesan();
    }
}