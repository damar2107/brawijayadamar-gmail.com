import java.text.DecimalFormat;
public class pertemuan2 {
    private String nama; //var field aka anggota
    private int kredit;
    private double ipk;
    private int poinKualitas;

       // Konstruktor pke parameter
    public pertemuan2(String nama, int kredit, double ipk, int poinKualitas) {
        this.nama = nama;
        this.kredit = kredit;
        this.ipk = ipk;
        this.poinKualitas = poinKualitas;
    }
    //metode untuk menghitung rata-rata poin nilai saat ini
    public double hitungRataRataPoin() {
        if (kredit == 0) {
            return 0;
        }
        return (double) poinKualitas / kredit;
    }
// Metode untuk nambah kredit, poin kualitas, dan memperbarui IPK
    public void boostkreditdanpoin(int tambahanKredit, int tambahanPoinKualitas) {
        kredit += tambahanKredit;
        poinKualitas += tambahanPoinKualitas;
        ipk = hitungRataRataPoin();
    }

//buat ngitung grade pake seleksi kondisi
    public String hitungGrade() {
        if (ipk >= 3.5 && poinKualitas >= 200) {
            return "A";
        } else if (ipk >= 3.0 && poinKualitas >= 150) {
            return "B";
        } else if (ipk >= 2.5 && poinKualitas >= 100) {
            return "C";
        } else {
            return "E";
        }
    } 


    //getter setter
    public String getNama() {
        return nama;
    }

    public int getKredit() {
        return kredit;
    }

    public double getIpk() {
        return ipk;
    }

    public int getPoinKualitas() {
        return poinKualitas;
    }

    public static void main(String[] args) {
        pertemuan2 mahasiswa = new pertemuan2("Damar", 60, 3.5, 210); //Contoh penggunaan kelas & init objek
        DecimalFormat df = new DecimalFormat("0.0"); //biar output ipk 1 angka desimal
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Kredit: " + mahasiswa.getKredit());
        System.out.println("IPK: " + df.format(mahasiswa.getIpk()));
        System.out.println("Poin Kualitas: " + mahasiswa.getPoinKualitas());
        System.out.println("Grade: " + mahasiswa.hitungGrade());

        mahasiswa.boostkreditdanpoin(78, 310);
        System.out.println("\nSetelah kredit dan poin kualitas ditambah:");
        System.out.println("Kredit: " + mahasiswa.getKredit());
        System.out.println("IPK: " + df.format(mahasiswa.getIpk()));
        System.out.println("Poin Kualitas: " + mahasiswa.getPoinKualitas());
        System.out.println("sekarang amu dapat grade: " + mahasiswa.hitungGrade());
    }
}