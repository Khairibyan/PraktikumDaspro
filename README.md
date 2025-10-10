Ini fitur 1
Ini fitur 2
Hello Github, ini adalah repository pertama saya.
Ini fiutr 3

Jawaban Praktikum Percobaan 1 :

1. variabel uktLunas sudah bertipe boolean, maka cukup ditulis if (uktLunas) tanpa menggunakan operator relasional seperti == true
2. tidak ada output tambahan karena blok if tidak dijalankan
3. }else{
        System.out.println("Registrasi ditolak, silahkan lakukan pemabayaran UKT");


Jawaban Praktiikum Percobaan 2 :

1. break berfungsi untuk menghentikan proses dalam satu blok switch-case setelah suatu kondisi terpenuhi, sehingga program tidak menjalankan case berikutnya secara berurutan.
2. default digunakan sebagai bagian cadangan yang akan dijalankan jika tidak ada case yang cocok dengan nilai yang diperiksa. Dengan adanya default, program tetap bisa memberikan keluaran meskipun input tidak valid.


Jawaban Praktikum Percobaan 3 :

1. Jika mahasiswa menjawab “No”, maka program akan langsung menampilkan pesan “Gagal! Mahasiswa masih memiliki tanggungan kompen.” karena kondisi if (bebasKompen.equalsIgnoreCase("Ya"))
2. program hanya akan menganggap syarat bimbingan terpenuhi jika bimbingan Pembimbing 1 minimal 8 kali dan bimbingan Pembimbing 2 minimal 4 kali. Operator && digunakan untuk memastikan kedua kondisi tersebut harus sama-sama benar.
3. Alur pemeriksaan program diawali dengan pengecekan apakah mahasiswa telah bebas kompen. Apabila syarat tersebut belum terpenuhi, program akan memberikan informasi bahwa mahasiswa masih memiliki tanggungan. Jika mahasiswa telah bebas kompen, sistem kemudian memeriksa jumlah log bimbingan Pembimbing 1 dan Pembimbing 2. Apabila kedua ketentuan bimbingan tersebut telah sesuai, maka mahasiswa dinyatakan memenuhi syarat untuk mengikuti ujian skripsi.