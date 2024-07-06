
package UAS_PBO;


public class Mobil {
    private String platNomor;
    private String merk;
    private int tahun;
    private double hargaSewa;

    // Konstruktor
    public Mobil(String platNomor, String merk, int tahun, double hargaSewa) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
    }

    // Mutator (Setter)
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    // Accesor (Getter)
    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    // Polymorphism (overloading)
    public double hitungBiayaSewa(int durasi) {
        return durasi * hargaSewa;
    }

    public double hitungBiayaSewa(int durasi, double diskon) {
        if (diskon == 1 ){
         double hasil =(durasi * hargaSewa) * (diskon - 0.1);
         return hasil;
        }else {
            double hasil = durasi * hargaSewa;
            return hasil;
        }
    }

    @Override
    public String toString() {
        return "Mobil{" +
                "platNomor='" + platNomor + '\'' +
                ", merk='" + merk + '\'' +
                ", tahun=" + tahun +
                ", hargaSewa=" + hargaSewa +
                '}';
    }
}
