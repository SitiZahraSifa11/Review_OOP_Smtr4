public class giro extends rekening {
    double limitPenarikan;

    public giro(String namaPemilik, String nomorRekening, double saldo, double limitPenarikan) {
        super(namaPemilik, nomorRekening, saldo);
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
            System.out.println(namaPemilik + " telah menarik: Rp " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi untuk penarikan.");
        }
    }
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Limit Penarikan: Rp " + getLimitPenarikan());
    }
}
