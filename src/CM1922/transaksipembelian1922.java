package CM1922;
public class transaksiPembelian1922 {
    public static Object tampilDataTransaksi;
    String kodeTransaksi22;
    String namaPembeli22;
    String tanggalPembelian22;
    int qty22;
    barang1922 brg22;
    

    transaksiPembelian1922(String kodeTransaksi22, String namaPembeli22, String tanggalPembelian22, int qty22, barang1922 Barang22) {
        this.kodeTransaksi22 = kodeTransaksi22;
        this.namaPembeli22 = namaPembeli22;
        this.tanggalPembelian22 = tanggalPembelian22;
        this.qty22 = qty22;
        this.brg22 = Barang22;
    }

    void tampilDataTransaksi() {

        System.out.printf("%-15s %-15s  %-15s %-15s %-15d %-15d", kodeTransaksi22, namaPembeli22, tanggalPembelian22, brg22.nama1922, qty22, brg22.harga1922);
        
    }
}