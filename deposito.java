public class deposito extends Rekening{
    int jangkaWaktu;
    double bunga ;
    boolean statusAktif;
    public deposito(String namaPemilik, String nomorRekening, double saldo, int jangkaWaktu, double bunga){
        super(namaPemilik, nomorRekening, saldo);
        this.jangkaWaktu=jangkaWaktu;
        this.bunga=bunga;
        this.statusAktif=true;
    }
    public double hitungBunga(){
        return(saldo*bunga/100)*(jangkaWaktu/12.0);
    }

    public void tarik(double jumlah){
        if(!statusAktif){
            System.out.println("===============================================================");
            System.out.println("Deposito sudah anda cairkan. Tidak bisa menarik saldo lagi.");
            System.out.println("===============================================================");
            return;
        }
    if (jangkaWaktu>0){
        System.out.println("===============================================================");
        System.out.println("Tidak bisa menarik saldo sebelum jatuh tempo.");
        System.out.println("===============================================================");
    }else{
        System.out.println("===============================================================");
        System.out.println("Deposito telah jatuh tempo. Saldo dan bunga sudah dicairkan.");
        System.out.println("Total saldo setelah bunga: "+saldo);
        statusAktif=false;
        System.out.println("===============================================================");
    }
    }
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("===============================================================");
        System.out.println("Jangka waktu: "+ jangkaWaktu+" bulan");
        System.out.println("Bunga: "+bunga+"% per tahun");
        System.out.println("Status: "+(statusAktif ? "Aktif" :"Sudah Dicairkan"));
        System.out.println("===============================================================");
    }
}
