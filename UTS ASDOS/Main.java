import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final int KAPASITAS_MAKSIMAL = 10;
    private static Hewan[] daftarHewan = new Hewan[KAPASITAS_MAKSIMAL];
    private static int jumlahHewanSekarang = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan = 0;
        
        while (pilihan != 4) {
            tampilkanMenuUtama();
            try {
                System.out.print("Pilih menu: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();

                switch (pilihan) {
                    case 1:
                        tambahDataHewan();
                        break;
                    case 2:
                        tampilkanDaftarHewan();
                        break;
                    case 3:
                        interaksiDenganHewan();
                        break;
                    case 4:
                        System.out.println("Terima kasih! Program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid! Harap masukkan sebuah angka.");
                scanner.nextLine();
            }
            System.out.println();
        }
        scanner.close();
    }

    private static void tampilkanMenuUtama() {
        System.out.println("===== Aplikasi Manajemen Hewan =====");
        System.out.println("1. Tambah Data Hewan");
        System.out.println("2. Tampilkan Daftar Hewan");
        System.out.println("3. Interaksi dengan Hewan");
        System.out.println("4. Keluar");
        System.out.println("================================================");
    }

    private static void tambahDataHewan() {
        System.out.println("\n--- Menu Tambah Hewan ---");
        
        if (jumlahHewanSekarang >= KAPASITAS_MAKSIMAL) {
            System.out.println("Maaf, kandang sudah penuh! Tidak bisa menambah hewan lagi.");
            return;
        }

        System.out.print("Pilih jenis hewan (1: Kucing, 2: Anjing, 3: Burung): ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan nama hewan: ");
        String nama = scanner.nextLine();

        Hewan hewanBaru = null;
        if (jenis == 1) {
            hewanBaru = new Kucing(nama);
        } else if (jenis == 2) {
            hewanBaru = new Anjing(nama);
        } else if (jenis == 3) {
            hewanBaru = new Burung(nama);
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }
        
        daftarHewan[jumlahHewanSekarang] = hewanBaru;
        jumlahHewanSekarang++;
        
        System.out.println(hewanBaru.getJenis() + " bernama " + hewanBaru.getNama() + " berhasil ditambahkan!");
    }

    private static void tampilkanDaftarHewan() {
        System.out.println("\n--- Daftar Hewan Peliharaan ---");
        
        if (jumlahHewanSekarang == 0) {
            System.out.println("Belum ada hewan yang terdaftar.");
        } else {
            for (int i = 0; i < jumlahHewanSekarang; i++) {
                System.out.println((i + 1) + ". " + daftarHewan[i].toString());
            }
        }
    }

    private static void interaksiDenganHewan() {
        System.out.println("\n--- Menu Interaksi ---");
        if (jumlahHewanSekarang == 0) {
            System.out.println("Belum ada hewan untuk diajak berinteraksi.");
            return;
        }

        tampilkanDaftarHewan();
        System.out.print("Pilih hewan (nomor) untuk berinteraksi: ");
        int pilihanHewan = scanner.nextInt();
        scanner.nextLine();

        if (pilihanHewan > 0 && pilihanHewan <= jumlahHewanSekarang) {
            Hewan hewanPilihan = daftarHewan[pilihanHewan - 1];
            
            System.out.println("\nPilih Aksi untuk " + hewanPilihan.getNama() + ":");
            System.out.println("1. Beri Makan");
            System.out.println("2. Ajak Tidur");
            System.out.println("3. Dengar Suaranya");
            System.out.print("Pilihan Aksi: ");
            int pilihanAksi = scanner.nextInt();
            scanner.nextLine();

            switch (pilihanAksi) {
                case 1:
                    hewanPilihan.makan();
                    break;
                case 2:
                    hewanPilihan.tidur();
                    break;
                case 3:
                    hewanPilihan.bersuara();
                    break;
                default:
                    System.out.println("Aksi tidak valid.");
            }
        } else {
            System.out.println("Nomor hewan tidak valid.");
        }
    }
}