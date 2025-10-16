package jobsheet6;

import java.util.Scanner;

public class sistemKelulusanMahasiswa16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi
        int nilaiTugas, nilaiUTS, nilaiUAS, nilaiUTS2, nilaiUAS2, nilaiTugas2;
        double nilaiAkhir1, nilaiAkhir2, rataRata;
        String nama, nim, nilai1, nilai2, statusNilai1, statusNilai2;
        boolean lulusSemester;

        // Input 
        System.out.println(" ===== INPUT DATA MAHASISWA ===== ");
        System.out.print("Masukkan Nama Mahasiswa : ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM Mahasiswa  : ");
        nim = sc.nextLine();

        System.out.println("\n --- Mata kuliah 1: Algoritma dan Pemrograman --- ");
        System.out.print("Masukan Nilai UTS   : ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        nilaiUAS = sc.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        nilaiTugas = sc.nextInt();

        System.out.println("\n --- Mata kuliah 2: Struktur Data --- ");
        System.out.print("Masukan Nilai UTS   : ");
        nilaiUTS2 = sc.nextInt();
        System.out.print("Masukan Nilai UAS   : ");
        nilaiUAS2 = sc.nextInt();
        System.out.print("Masukan Nilai Tugas : ");
        nilaiTugas2 = sc.nextInt();

        // Proses
        nilaiAkhir1 = (nilaiUTS * 0.30) + (0.4 * nilaiUAS) + (0.3 * nilaiTugas);
        nilaiAkhir2 = (nilaiUTS2 * 0.30) + (0.4 * nilaiUAS2) + (0.3 * nilaiTugas2);
        rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // If Else if else
        if (nilaiAkhir1 >= 80) nilai1 = "A";
            else if (nilaiAkhir1 >= 73) nilai1 = "B+";
            else if (nilaiAkhir1 >= 65) nilai1 = "B";
            else if (nilaiAkhir1 >= 60) nilai1 = "C+";
            else if (nilaiAkhir1 >= 50) nilai1 = "C";
            else if (nilaiAkhir1 >= 39) nilai1 = "D";
        else nilai1 = "E";

        if (nilaiAkhir2 >= 80) nilai2 = "A";
            else if (nilaiAkhir2 >= 73) nilai2 = "B+";
            else if (nilaiAkhir2 >= 65) nilai2 = "B";
            else if (nilaiAkhir2 >= 60) nilai2 = "C+";
            else if (nilaiAkhir2 >= 50) nilai2 = "C";
            else if (nilaiAkhir2 >= 39) nilai2 = "D";
        else nilai2 = "E";

    // if else
    if (nilaiAkhir2 >= 60) {
            statusNilai1 = "Lulus";
       } else {
            statusNilai1 = "TIdak Lulus";
         }

        if (nilaiAkhir1 >= 60) {
        statusNilai2 = "Lulus";
    } else {
        statusNilai2 = "TIdak Lulus";
    }

    // Nested if 
     if (nilaiAkhir1 >= 70 && nilaiAkhir2 >= 70){
            if (rataRata >= 70){
            statusNilai1 = "Lulus (Lulus (Rata-rata >= 70))";
           } else {
            statusNilai1 = "Tidak Lulus (Rata-rata < 70)";
          }
        } else {
            statusNilai1 = "Tidak Lulus (Nilai < 70)";
        }

        // Set lulusSemester rataRata
        lulusSemester = rataRata >= 70;


        // Output
        System.out.println("================================================================================================");
        System.out.println("                                   HASIL PENILAIAN AKADEMIK                                    ");
        System.out.println("================================================================================================");
        System.out.println("Nama : " + nama);
        System.out.println("NIM  : " + nim);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Mata Kuliah               UTS   UAS   Tugas   Nilai Akhir   Nilai Huruf   Status");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Algoritma Pemrograman     " + (int)nilaiUTS + "    " + (int)nilaiUAS + "    " + (int)nilaiTugas +
                           "      " + String.format("%.2f", nilaiAkhir1) + "          " + nilai1 + "          " + statusNilai1);
        System.out.println("Struktur Data             " + (int)nilaiUTS2 + "    " + (int)nilaiUAS2 + "    " + (int)nilaiTugas2 +
                           "      " + String.format("%.2f", nilaiAkhir2) + "          " + nilai2 + "          " + statusNilai2);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Rata-rata Nilai Akhir : " + String.format("%.2f", rataRata));
        System.out.println("Status Semester       : " + (lulusSemester ? "LULUS" : "TIDAK LULUS"));
        System.out.println("================================================================================================");

        sc.close();
    }

}
