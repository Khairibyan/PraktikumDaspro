import java.util.Scanner;

public class AksesWifiKampus16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");

        System.out.print("Masukkan jenis pengguna (dosen/mahasiswa): ");
        String jenisPengguna = sc.nextLine().trim();

        // Hanya ditanyakan bila pengguna mahasiswa
        int sks = 0;
        if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            sks = sc.nextInt();
        }

        // Logika utama sesuai flowchart
        if (jenisPengguna.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenisPengguna.equalsIgnoreCase("mahasiswa")) {
            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses WiFi ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses WiFi ditolak, jenis pengguna tidak dikenal.");
        }

        sc.close();
    }
}
