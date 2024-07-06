# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Mobil`, `Pelanggan`, `PelangganVIP` dan `RentalMobil` adalah contoh dari class.

```bash
public class Mobil { {
    ...
}

public class Pelanggan {
    ...
}

public class PelangganVIP extends Pelanggan {
    ...
}
```
public class RentalMobil {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `RentalMobil rental = new RentalMobil();
` adalah contoh pembuatan object.

```bash
rental.tambahMobil(new Mobil(platNomor, merk, tahun, hargaSewa));
rental.tambahPelanggan(new Pelanggan(nama, alamat, nomorTelepon));
rental.tambahPelanggan(new Pelanggan(nama, alamat, nomorTelepon));
rental.tambahPelangganVIP(new PelangganVIP(namaVIP, alamatVIP, nomorTeleponVIP, diskon, nomorAnggota));
```
3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `platNomor`, `merk`, `tahun`, `hargaSewa`, `nama`, `alamat` dan `nomorTelepon` adalah contoh atribut.

```bash
String platNomor;
String merk;
int tahun;
double hargaSewa;
String nama;
String alamat;
String nomorTelepon;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Mobil`,`Pelanggan` dan `PelangganVIP`.

```bash
public Mobil(String platNomor, String merk, int tahun, double hargaSewa) {
        this.platNomor = platNomor;
        this.merk = merk;
        this.tahun = tahun;
        this.hargaSewa = hargaSewa;
    }
public Pelanggan(String nama, String alamat, String nomorTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomorTelepon = nomorTelepon;
    }

 public PelangganVIP(String nama, String alamat, String nomorTelepon, double diskon, String nomorAnggota) {
        super(nama, alamat, nomorTelepon);
        this.diskon = diskon;
        this.nomorAnggota = nomorAnggota;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setPlatNomor`,`setTahun`,`setHargaSewa`,`setNama`,`setAlamat` dan `setNomorTelepon` adalah contoh method mutator.

```bash
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

 public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getPlatNomor`,`getMerk`,`getTahun`,`getHargaSewa`,`getNama`,`getAlamat` dan`getNomorTelepon` adalah contoh method accessor.

```bash
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

 public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `diskon`,`nomorAnggota`,`nomorTelepon`,`alamat`,`nama`,`hargaSewa`,`tahun`,`merk` dan `platNomor` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String platNomor;
    private String merk;
    private int tahun;
    private double hargaSewa;

 private String nama;
    private String alamat;
    private String nomorTelepon;

private double diskon;
    private String nomorAnggota;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `PelangganVIP` mewarisi `Mobil` dengan sintaks `extends`.

```bash
public class PelangganVIP extends Pelanggan {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Mahasiswa` merupakan overloading method `displayInfo` dan `displayInfo` di `MahasiswaDetail` merupakan override dari method `displayInfo` di `Mahasiswa`.

```bash
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
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dan seleksi `switch` .

```bash
switch (pilihan) {
                case 1:
                    System.out.print("Masukkan plat nomor: ");
                    String platNomor = scanner.nextLine();
                    System.out.print("Masukkan merk: ");
                    String merk = scanner.nextLine();
                    System.out.print("Masukkan tahun: ");
                    int tahun = scanner.nextInt();
                    System.out.print("Masukkan harga sewa per hari: ");
                    double hargaSewa = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    rental.tambahMobil(new Mobil(platNomor, merk, tahun, hargaSewa));
                    break;
                case 2:
                    System.out.print("Masukkan nama pelanggan: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamat = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String nomorTelepon = scanner.nextLine();
                    rental.tambahPelanggan(new Pelanggan(nama, alamat, nomorTelepon));
                    break;
                case 3:
                    System.out.print("Masukkan nama pelanggan VIP: ");
                    String namaVIP = scanner.nextLine();
                    System.out.print("Masukkan alamat: ");
                    String alamatVIP = scanner.nextLine();
                    System.out.print("Masukkan nomor telepon: ");
                    String nomorTeleponVIP = scanner.nextLine();
                    System.out.print("Masukkan diskon (0-1) untuk mendapatkan diskon 10% : ");
                    double diskon = scanner.nextDouble();
                    scanner.nextLine();  // Consume newline
                    System.out.print("Masukkan nomor anggota VIP: ");
                    String nomorAnggota = scanner.nextLine();
                    rental.tambahPelangganVIP(new PelangganVIP(namaVIP, alamatVIP, nomorTeleponVIP, diskon, nomorAnggota));
                    break;
                case 4:
                    rental.tampilkanDaftarMobil();
                    break;
                case 5:
                    rental.tampilkanDaftarPelanggan();
                    break;
                case 6:
                    rental.sewaMobil();
                    break;
                case 7:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
 public void sewaMobil() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Apakah pelanggan VIP? (yes/no): ");
            String isVIP = scanner.nextLine();

            System.out.print("Masukkan nama pelanggan: ");
            String nama = scanner.nextLine();

            Pelanggan pelanggan = null;
            PelangganVIP pelangganVIP = null;

            if (isVIP.equalsIgnoreCase("yes")) {
                for (PelangganVIP p : daftarPelangganVIP) {
                    if (p.getNama().equalsIgnoreCase(nama)) {
                        pelangganVIP = p;
                        break;
                    }
                }
                if (pelangganVIP == null) {
                    System.out.println("Pelanggan VIP tidak ditemukan.");
                    return;
                }
            } else {
                for (Pelanggan p : daftarPelanggan) {
                    if (p.getNama().equalsIgnoreCase(nama)) {
                        pelanggan = p;
                        break;
                    }
                }
                if (pelanggan == null) {
                    System.out.println("Pelanggan tidak ditemukan.");
                    return;
                }
            }

            System.out.print("Masukkan plat nomor mobil: ");
            String platNomor = scanner.nextLine();

            Mobil mobil = null;
            for (Mobil m : daftarMobil) {
                if (m.getPlatNomor().equalsIgnoreCase(platNomor)) {
                    mobil = m;
                    break;
                }
            }

            if (mobil == null) {
                System.out.println("Mobil tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan durasi sewa (hari): ");
            int durasi = scanner.nextInt();

            double biaya;
            if (pelangganVIP != null) {
                biaya = mobil.hitungBiayaSewa(durasi, pelangganVIP.getDiskon());
            } else {
                biaya = mobil.hitungBiayaSewa(durasi);
            }

            System.out.println("Total biaya sewa: " + biaya);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
        }
    }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
 System.out.print("Apakah pelanggan VIP? (yes/no): ");
            String isVIP = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `public void tampilkanDaftarMobil() { for (Mobil mobil : daftarMobil) { System.out.println(mobil);` adalah contoh penggunaan array.

```bash
public void tampilkanDaftarMobil() {
    for (Mobil mobil : daftarMobil) {
        System.out.println(mobil);
    }
}
public void tampilkanDaftarPelanggan() {
    for (Pelanggan pelanggan : daftarPelanggan) {
        System.out.println(pelanggan);
    }
    for (PelangganVIP pelangganVIP : daftarPelangganVIP) {
        System.out.println(pelangganVIP);
    }
}

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
public void sewaMobil() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Apakah pelanggan VIP? (yes/no): ");
            String isVIP = scanner.nextLine();

            System.out.print("Masukkan nama pelanggan: ");
            String nama = scanner.nextLine();

            Pelanggan pelanggan = null;
            PelangganVIP pelangganVIP = null;

            if (isVIP.equalsIgnoreCase("yes")) {
                for (PelangganVIP p : daftarPelangganVIP) {
                    if (p.getNama().equalsIgnoreCase(nama)) {
                        pelangganVIP = p;
                        break;
                    }
                }
                if (pelangganVIP == null) {
                    System.out.println("Pelanggan VIP tidak ditemukan.");
                    return;
                }
            } else {
                for (Pelanggan p : daftarPelanggan) {
                    if (p.getNama().equalsIgnoreCase(nama)) {
                        pelanggan = p;
                        break;
                    }
                }
                if (pelanggan == null) {
                    System.out.println("Pelanggan tidak ditemukan.");
                    return;
                }
            }

            System.out.print("Masukkan plat nomor mobil: ");
            String platNomor = scanner.nextLine();

            Mobil mobil = null;
            for (Mobil m : daftarMobil) {
                if (m.getPlatNomor().equalsIgnoreCase(platNomor)) {
                    mobil = m;
                    break;
                }
            }

            if (mobil == null) {
                System.out.println("Mobil tidak ditemukan.");
                return;
            }

            System.out.print("Masukkan durasi sewa (hari): ");
            int durasi = scanner.nextInt();

            double biaya;
            if (pelangganVIP != null) {
                biaya = mobil.hitungBiayaSewa(durasi, pelangganVIP.getDiskon());
            } else {
                biaya = mobil.hitungBiayaSewa(durasi);
            }

            System.out.println("Total biaya sewa: " + biaya);
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silakan coba lagi.");
        }
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Akmal Bahana Putera
NPM: 2110010606
