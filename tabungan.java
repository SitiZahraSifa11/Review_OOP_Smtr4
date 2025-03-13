public class tabungan extends rekening {
    double bungaTahunan;


    public tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }
    public double getBungaTahunan() {
        return bungaTahunan;
    }
    public void setBungaTahunan(double bungaTahunan) {
        this.bungaTahunan = bungaTahunan;
    }

    public void hitungbunga (int bulan){
        double bunga = (bungaTahunan/100 * saldo)*(bulan/12.0);
        bunga += bunga;
        System.out.println("Bunga telah ditambahkan : Rp "+ bunga);
    }
    public void hitungBunga(int bulan) {
        double bunga = (saldo* bungaTahunan / 100) * (bulan / 12.0);
        setSaldo(saldo + bunga);
        System.out.println("Bunga ditambahkan: Rp " + bunga);
    }
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
}

}






















// public void hitungBunga(int bulan) {
//     double bunga = (saldo * bungaTahunan / 100) * (bulan / 12.0);
//     saldo += bunga;
//     System.out.println("Bunga ditambahkan: Rp " + bunga);
// }

// @Override
// public void tampilkanInfo() {
//     super.tampilkanInfo();
//     System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
// }
// }