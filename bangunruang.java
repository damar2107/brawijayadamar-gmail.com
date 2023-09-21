public class bangunruang {
    protected Integer panjang; //var field aka anggota
    protected Integer lebar;
    protected Integer tinggi;

    // Constructor pke parameter
    public bangunruang(Integer panjang, Integer lebar, Integer tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }


    public Integer hitungVolume() {
        if (panjang != null && lebar != null && tinggi != null) {
            return panjang * lebar * tinggi;
        } else {
            return null;
        }
    }

}