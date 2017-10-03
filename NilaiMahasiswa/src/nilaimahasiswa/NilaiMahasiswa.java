/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author 99
 * Nama  : Gilang Kusuma Wijaya
 * Kelas : PBO-11
 * NIM   : 10116506
 */
public class NilaiMahasiswa {

    String nama, nim, keterangan;
    char index;

    double nQuiz;
    double uts;
    double uas;
    double nilaiAkhir;

    double getNilaiAkhir(double nQuiz, double uts, double uas) {
        return nilaiAkhir = (0.2 * nQuiz) + (0.3 * uts) + (0.5 * uas);

    }

    public double getQuiz() {
        return nQuiz;
    }

    public void setQuiz(double quiz) {
        this.nQuiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void getIndexNilai(double nilaiAkhir) {
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            index = 'A';
            keterangan = "Sangat baik";
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
            keterangan = "Baik";
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
            keterangan = "Cukup";
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
            keterangan = "Kurang";
        } else if (nilaiAkhir <= 45) {
            index = 'E';
            keterangan = "Sangat Kurang";
        }
        System.out.println("Index = " + index);
        System.out.println("Keterangan = " + keterangan);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        NilaiMahasiswa oMhs = new NilaiMahasiswa();
        oMhs.setNama("Gilang Kusuma Wijaya");
        oMhs.setNim("10116506");
        oMhs.setQuiz(60);
        oMhs.setUts(80);
        oMhs.setUas(100);

        for (int i = 1; i <= 4; i++) {
            System.out.println("Nama ke " + i + "\t= " + oMhs.getNama());
        }
        for (int j = 8; j >= 1; j--) {
            System.out.println("Nim ke " + j + "\t= " + oMhs.getNim());
        }
        double nilaiAkhir = oMhs.getNilaiAkhir(oMhs.getQuiz(), oMhs.getUts(), oMhs.getUas());
        System.out.println("\nQuiz : " + oMhs.getQuiz());
        System.out.println("UTS : " + oMhs.getUts());
        System.out.println("UAS : " + oMhs.getUas());
        System.out.println("Nilai Akhir = " + nilaiAkhir);
        oMhs.getIndexNilai(nilaiAkhir);
    }
}
