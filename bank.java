import java.util.Scanner;


public class bank {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n======SELAMAT DATANG======");
        System.out.println("\nSilakan nikmati layanan kami.");
    
        System.out.println("=========================================");
        System.out.print("Masukkan nama pemilik rekening: ");
        String namaPemilik = scanner.nextLine();
        System.out.println("=========================================");
        System.out.print("Masukkan saldo awal: ");
        double saldo = scanner.nextDouble();
        System.out.println("=========================================");
        System.out.println("Masukan nomor rekening anda :");
        String nomorRekening=scanner.nextLine();
        System.out.println("=========================================");

        System.out.println("=========================================");
        System.out.println("Pilih jenis rekening:");
        System.out.println("1. Tabungan");
        System.out.println("2. Giro");
        System.out.println("3. Deposito");
        System.out.println("=========================================");
        System.out.println("Pilihan: ");
        System.out.println("=========================================");
        int jenisRekening = scanner.nextInt();

        Rekening rekening;

        if (jenisRekening == 1) {
            System.out.print("Bunga Tahunan (%): ");
            double bungaTahunan = scanner.nextDouble();
            rekening = new tabungan(namaPemilik, nomorRekening, saldo, bungaTahunan);
        } else if (jenisRekening == 2) {
            System.out.print("Limit Penarikan Giro: ");
            double limitPenarikan = scanner.nextDouble();
            rekening = new giro(namaPemilik, nomorRekening, saldo, limitPenarikan);
        } else if (jenisRekening == 3) {
            System.out.print("Jangka Waktu (bulan): ");
            int jangkaWaktu = scanner.nextInt();
            System.out.print("Bunga Tahunan (%): ");
            double bungaTahunan = scanner.nextDouble();
            rekening = new deposito(namaPemilik, nomorRekening, saldo, jangkaWaktu, bungaTahunan);
            
            ((deposito) rekening).hitungBunga();
            
            System.out.println("Mencoba menarik saldo sebelum jatuh tempo");
            ((deposito) rekening).tarik(saldo / 2);
        } else {
            System.out.println("Pilihan tidak valid. Program berhenti.");
            scanner.close();
            return;
        }

        while (true) {
            System.out.println("\n=== Menu BANK ===");
            System.out.println("1. Lihat Informasi");
            System.out.println("2. Setor Uang");
            System.out.println("3. Tarik Uang");
            System.out.println("4. Keluar");
            System.out.println("=========================================");
            System.out.println("Pilih Dahulu: ");
            System.out.println("=========================================");
            int pilihan = scanner.nextInt();

    

            if (pilihan == 1) {
                rekening.tampilkanInfo();
            } else if (pilihan == 2) {
                System.out.print("Masukkan jumlah setor: ");
                double jumlah = scanner.nextDouble();
                rekening.setor(jumlah);
                System.out.println("Berhasil !!");
                System.out.println("=========================================");
            } else if (pilihan == 3) {
                System.out.print("Masukkan jumlah Saldo yang Ditarik: ");
                double jumlah = scanner.nextDouble();
                rekening.tarik(jumlah);
                System.out.println("=========================================");
            } else if (pilihan == 4) {
                System.out.println("Terima kasih telah menggunakan layanan bank.");
                System.out.println("=========================================");
                break;
                
            } else {
                System.out.println("Pilihan tidak ada!, coba lagi.");
                System.out.println("=========================================");
            }
        }

        scanner.close();
    }
}

