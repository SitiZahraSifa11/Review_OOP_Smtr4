public class Rekening {
    String namaPemilik;
    String nomorRekening;
    double saldo;
    double limitGiro;
    public Rekening(String namaPemilik, String nomorRekening, double saldo) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.limitGiro=0;
    }
    public Rekening(String namaPemilik, String nomorRekening, double saldo, double limitGiro) {
        this.namaPemilik = namaPemilik;
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
        this.limitGiro=limitGiro;
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
    public double getLimitGiro(){
        return limitGiro;
    }
    public void setLimitGiro(double limitGiro){
        this.limitGiro=limitGiro;
    }

    public void setor(double jumlah) {
        if(jumlah>0){
            saldo += jumlah;
            System.out.println("===============================================================");
        System.out.println(namaPemilik + " telah menyetor: Rp " + jumlah);
        System.out.println("Saldo Terkini : Rp " + saldo);
        System.out.println("===============================================================");
        }else{
            System.out.println("===============================================================");
            System.out.println("Maaf Anda Belum Memasukan Nominal ");
            System.out.println("===============================================================");
        }
    }
    public void setor(double jumlah, boolean tf){
        if(jumlah >0){
            if(tf){
                double admin=3000;
                if(jumlah > admin){
                    saldo += (jumlah-admin);
                    System.out.println("===============================================================");
                    System.out.println("Setor dengan metode transfer berhasil!!" );
                    System.out.println("Biaya admin :  " + admin);
                    System.out.println("Saldo Terkini : Rp " + saldo);

                    System.out.println("===============================================================");
                }else{
                    System.out.println("===============================================================");
                    System.out.println("Jumlah penyetoran harus lebih besar dari biaya admin!");
                    System.out.println("===============================================================");
                }
            }else{
                setor(jumlah);
            }
        }else{
            System.out.println("===============================================================");
            System.out.println("Setoran harus ada nominalnya.");
            System.out.println("===============================================================");
        }

    }
    public void tarik(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("===============================================================");
            System.out.println("Penarikan berhasil!");
            System.out.println("===============================================================");
            System.out.println(namaPemilik + " telah menarik: Rp " + jumlah);
            System.out.println("Saldo Terkini : Rp " + saldo);
            System.out.println("===============================================================");
        } else if((saldo+limitGiro)>=jumlah) {
            double sisa = jumlah-saldo;
            saldo=0;
            limitGiro -= sisa;
            System.out.println("===============================================================");
            System.out.println("Penarikan berhasil melalui limit giro.");
            System.out.println("Sisa limit giro: Rp " + limitGiro);
            System.out.println("===============================================================");
            
        }else{
            System.out.println("===============================================================");
            System.out.println("Saldo  dan limit tidak mencukupi untuk penarikan.");
            System.out.println("===============================================================");
        }
    }
    
    public void tampilkanInfo() {
        System.out.println("===============================================================");
        System.out.println("Nama Pemilik: " + getNamaPemilik());
        System.out.println("Nomor Rekening: " + getNomorRekening());
        System.out.println("Saldo: Rp " + getSaldo());
        if (limitGiro > 0){
            System.out.println("Limit giro: Rp. "+getLimitGiro());
        }
        System.out.println("===============================================================");
    }

}


