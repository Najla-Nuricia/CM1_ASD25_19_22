package CM1922;
public class transaksipembelian1922 {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    barang1922 Barang;

    transaksipembelian1922(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, barang1922 Barang) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.Barang = Barang;
    }

    void tampilDataTransaksi() {
        System.out.println("Kode Transaksi: " + kodeTransaksi);
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
        System.out.println("Jumlah Barang: " + qty);
        // Barang.tampilBarang();
    }
}