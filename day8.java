package contohKasus;

public class day8 {

    public static void main(String[] args) {
        String kodepasien = "PS0002";
        String statuspasien;
        int biayadaftarpasien;
        int kodekamar = 4444;

        String namakamar;
        int biayakamar;
        String kodedokter = "DK003";
        String namadokter;
        int biayapemeriksaan;
        int lamamenginap = 2;
        int diskon;
        double totalbayar;

//int durasi
        if (kodepasien == "PS0001") {
            statuspasien = "Pasien Baru";
            biayadaftarpasien = 500000;
        } else if (kodepasien == "PS0002") {
            statuspasien = "Pasien Lama";
            biayadaftarpasien = 400000;
        } else if (kodepasien == "PS0003") {
            statuspasien = "Pasien BPJS";
            biayadaftarpasien = 300000;
        } else if (kodepasien == "PS0004") {
            statuspasien = "Pasien Akses";
            biayadaftarpasien = 200000;
        } else {
            statuspasien = "kosong";
            biayadaftarpasien = 0;
        }

        if (kodekamar == 1111) {
            namakamar = "Kamar Melati";
            biayakamar = 1000000;
        } else if (kodekamar == 2222) {
            namakamar = "Kamar Mawar";
            biayakamar = 2000000;
        } else if (kodekamar == 3333) {
            namakamar = "Kamar Dahlia";
            biayakamar = 3000000;
        } else if (kodekamar == 4444) {
            namakamar = "Kamar Anggrek";
            biayakamar = 4000000;
        } else {
            namakamar = "kosong";
            biayakamar = 0;
        }

        if (kodedokter == "DK001") {
            namadokter = "DR Andi";
            biayapemeriksaan = 500000;
        } else if (kodedokter == "DK002") {
            namadokter = "DR Joko";
            biayapemeriksaan = 400000;
        } else if (kodedokter == "DK003") {
            namadokter = "DR Karni";
            biayapemeriksaan = 300000;
        } else if (kodedokter == "DK004") {
            namadokter = "DR Amin";
            biayapemeriksaan = 200000;
        } else if (kodedokter == "DK005") {
            namadokter = "DR.l Udin";
            biayapemeriksaan = 100000;
        } else {
            namadokter = "kosong";
            biayapemeriksaan = 0;
        }
        if (kodedokter == "DK001") {
            namadokter = "DR Andi";
            biayapemeriksaan = 500000;
        } else if (kodedokter == "DK002") {
            namadokter = "DR Joko";
            biayapemeriksaan = 400000;
        } else if (kodedokter == "DK003") {
            namadokter = "DR Karni";
            biayapemeriksaan = 300000;
        } else if (kodedokter == "DK004") {
            namadokter = "DR Amin";
            biayapemeriksaan = 200000;
        } else if (kodedokter == "DK005") {
            namadokter = "DR.l Udin";
            biayapemeriksaan = 100000;
        } else {
            namadokter = "kosong";
            biayapemeriksaan = 0;
            
        //proses perhitungan if 
        }
        if (lamamenginap > 10) {
            diskon = 50;
        } else if (lamamenginap > 8) {
            diskon = 40;
        } else if (lamamenginap > 6) {
            diskon = 30;
        } else if (lamamenginap > 4) {
            diskon = 20;
        } else if (lamamenginap > 1) {
            diskon = 10;
        } else {
            diskon = 0;
        }
        
        //proses hitung diskon
        int hasil = biayakamar * diskon / 100;
        //proses perhitungan biaya
        totalbayar = (biayadaftarpasien + biayakamar + biayapemeriksaan - hasil);

        //tampil ke layar monitor System.out.println("Status Pasien " +statuspasien);
        System.out.println("Jumlah Biaya Pendaftaran Pasien " + biayadaftarpasien);
        System.out.println("Nama Kamar " + namakamar);
        System.out.println("Jumlah Biaya Kamar " + biayakamar);
        System.out.println("Nama Dokter " + namadokter);
        System.out.println("Biaya Pemeriksaan " + biayapemeriksaan);
        System.out.println("Selamat Anda Mendapatkan Diskon Sebesar " + diskon + "%");
        System.out.println("Bayar menginap anda : " + hasil);
        System.out.println("Total Biaya Yang Anda Bayar" + totalbayar);


    }

}

   
