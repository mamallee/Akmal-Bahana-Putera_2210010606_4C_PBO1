
package UAS_PBO;


public class PelangganVIP extends Pelanggan {
    private double diskon;
    private String nomorAnggota;

    // Konstruktor
    public PelangganVIP(String nama, String alamat, String nomorTelepon, double diskon, String nomorAnggota) {
        super(nama, alamat, nomorTelepon);
        this.diskon = diskon;
        this.nomorAnggota = nomorAnggota;
    }

    // Mutator (Setter)
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    public void setNomorAnggota(String nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    // Accesor (Getter)
    public double getDiskon() {
        return diskon;
    }

    public String getNomorAnggota() {
        return nomorAnggota;
    }

    // Polymorphism (overriding)
    @Override
    public String toString() {
        return "PelangganVIP{" +
                "nama='" + getNama() + '\'' +
                ", alamat='" + getAlamat() + '\'' +
                ", nomorTelepon='" + getNomorTelepon() + '\'' +
                ", diskon=" + diskon +
                ", nomorAnggota='" + nomorAnggota + '\'' +
                '}';
    }
}
