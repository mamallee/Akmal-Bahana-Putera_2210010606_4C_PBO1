
package UAS_PBO;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RentalMobil {
    private final ArrayList<Mobil> daftarMobil = new ArrayList<>();
    private final ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    private final ArrayList<PelangganVIP> daftarPelangganVIP = new ArrayList<>();

    public void tambahMobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }

    public void tambahPelanggan(Pelanggan pelanggan) {
        daftarPelanggan.add(pelanggan);
    }

    public void tambahPelangganVIP(PelangganVIP pelangganVIP) {
        daftarPelangganVIP.add(pelangganVIP);
    }

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

    public static void main(String[] args) {
        RentalMobil rental = new RentalMobil();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tambah mobil");
            System.out.println("2. Tambah pelanggan");
            System.out.println("3. Tambah pelanggan VIP");
            System.out.println("4. Tampilkan daftar mobil");
            System.out.println("5. Tampilkan daftar pelanggan");
            System.out.println("6. Sewa mobil");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline

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
        }
    }
}
