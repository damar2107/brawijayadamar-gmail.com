public class pertemuan2 {
    private String nama;  //ini var field aka anggota
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

    // Metode untuk menghitung rata-rata poin nilai saat ini
    public double hitungRataRataPoin() {
        if (kredit == 0) {
            return 0;
        }
        return (double) poinKualitas / kredit;
    }

    // Metode untuk menambahkan kredit, poin kualitas, dan memperbarui IPK
    public void boostkreditdanpoin(int tambahanKredit, int tambahanPoinKualitas) {
        kredit += tambahanKredit;
        poinKualitas += tambahanPoinKualitas;
        ipk = hitungRataRataPoin();
    }

    // Getter dan Setter untuk Nama
    public String getNama() {
        return nama;
    }


    // Getter dan Setter buat Kredit
    public int getKredit() {
        return kredit;
    }



    // Getter dan Setter buat IPK
    public double getIpk() {
        return ipk;
    }



    // Getter dan Setter untuk Poin Kualitas
    public int getPoinKualitas() {
        return poinKualitas;
    }



    public static void main(String[] args) {
        // Contoh penggunaan kelas Student & init objek
        pertemuan2 mahasiswa = new pertemuan2("Damar", 60, 3.5, 210);
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Kredit: " + mahasiswa.getKredit());
        System.out.println("IPK: " + mahasiswa.getIpk());
        System.out.println("Poin kwalitas: " + mahasiswa.getPoinKualitas());

        // Menambahkan kredit dan poin kwalitas
        mahasiswa.boostkreditdanpoin(78, 310);
        System.out.println("\nSetelah menambah kredit dan poin kualitas:");
        System.out.println("Kredit: " + mahasiswa.getKredit());
        System.out.println("IPK: " + mahasiswa.getIpk());
        System.out.println("Poin Kualitas kamu: " + mahasiswa.getPoinKualitas());
    }
}
