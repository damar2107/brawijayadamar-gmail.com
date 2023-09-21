public class mainbangunruang {
    public static void main(String[] args) {
        // Memanggil constructor dan menginisialisasi objek tugas
        tugas objek = new tugas(5, 3, 2);

        Integer volume = objek.hitungVolume();
        System.out.println("Volume: " + volume);
    }
}
