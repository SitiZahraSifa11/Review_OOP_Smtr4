public class giro extends Rekening {
    double limitPenarikan;

    public giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo,0);
        this.limitPenarikan = limitPenarikan;
    }
    public double getLimitPenarikan() {
        return limitPenarikan;
    }
    public void setLimitPenarikan(double limitPenarikan) {
        this.limitPenarikan = limitPenarikan;
    }
    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("===============================================================");
            System.out.println(" Penarikan berhasil !" );
            System.out.println(namaPemilik + " telah menarik: Rp " + jumlah);
            System.out.println("===============================================================");
        }else if((getSaldo()+limitPenarikan)>= jumlah){
            double sisa = jumlah - getSaldo();
            setSaldo(0);
            limitPenarikan-=sisa;
            System.out.println("===============================================================");
            System.out.println("Penarikan berhasil dengan menggunakan limit giro.");
            System.out.println("Sisa limit giro: " + limitPenarikan);
            System.out.println("===============================================================");
        } 
        else {

            System.out.println("===============================================================");
            System.out.println("Saldo dan limit giro tidak mencukupi untuk penarikan.");
            System.out.println("===============================================================");
        }
    }
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("===============================================================");
        System.out.println("Limit Penarikan: Rp " + getLimitPenarikan());
        System.out.println("===============================================================");
    }
}
