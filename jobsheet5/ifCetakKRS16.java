import java.util.Scanner;
public class ifCetakKRS16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    System.out.println("--- cetak KRS SIAKAD ---");
    System.out.println("Apakah UKT sudah lunas? (true/false): ");
    boolean uktlunas = sc.nextBoolean();
    
    if (uktlunas){
        System.out.println("Pembayaran UKT sudah lunas");
        System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
    }else{
        System.out.println("Registrasi ditolak, silahkan lakukan pemabayaran UKT");
    }

       String hasil = uktlunas
                ? "Pembayaran UKT terverifikasi, silakan cetak KRS"
                : "Registrasi ditolak, silakan lakukan pembayaran UKT terlebih dahulu";

        System.out.println(hasil);
    sc.close();

}
}


    
