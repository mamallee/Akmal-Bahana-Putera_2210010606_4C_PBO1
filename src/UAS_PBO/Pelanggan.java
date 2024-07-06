
package UAS_PBO;


public class Pelanggan {
   private String nama;
    private String alamat;
    private String nomorTelepon;

    // Konstruktor
    public Pelanggan(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

    // Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    // Accesor (Getter)
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    @Override
    public String toString() {
        return "Pelanggan{" +
                "nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", nomorTelepon='" + nomorTelepon + '\'' +
                '}';
    }
}
