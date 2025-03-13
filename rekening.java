public class rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;
    public rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }
    public String getNamaPemilik() {
        return namaPemilik;
    }
    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }
    public String getNomorRekening() {
        return nomorRekening;
    }
    public void setNomorRekening(String nomorRekening) {
        this.nomorRekening = nomorRekening;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setor(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " telah menyetor: Rp " + jumlah);
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
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("Nomor Rekening: " + getNomorRekening());
        System.out.println("Saldo: Rp " + getSaldo());
    }

}
























// public rekening(String namaPemilik, String nomorRekening, double saldoPertama) {
//         this.namaPemilik = namaPemilik;
//         this.nomorRekening = nomorRekening;
//         this.saldo = saldoPertama;
//     }


