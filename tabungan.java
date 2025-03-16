public class tabungan extends Rekening {
    double bungaTahunan;


    public tabungan(String namaPemilik, String nomorRekening, double saldo, double bungaTahunan) {
        super(namaPemilik, nomorRekening, saldo);
        this.bungaTahunan = bungaTahunan;
    }
    public double getBungaTahunan() {
        return bungaTahunan;
    }
    
    

    public void hitungbunga (int bulan){
        double bunga = (bungaTahunan/100 * saldo)*(bulan/12.0);
        bunga += bunga;
        System.out.println("===============================================================");
        System.out.println("Bunga telah ditambahkan : Rp "+ bunga);
        System.out.println("===============================================================");
    }
    
    public void tampilkanInfo() {
    super.tampilkanInfo();
    System.out.println("===============================================================");
    System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    System.out.println("===============================================================");
}

}
