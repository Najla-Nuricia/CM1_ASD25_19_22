package CM1922;
public class transaksipembelian1922 {
    String kodeTransaksi22;
    String namaPembeli22;
    String tanggalPembelian22;
    int qty22;
    barang1922 brg22;

    transaksipembelian1922(String kodeTransaksi22, String namaPembeli22, String tanggalPembelian22, int qty22, barang1922 Barang22) {
        this.kodeTransaksi22 = kodeTransaksi22;
        this.namaPembeli22 = namaPembeli22;
        this.tanggalPembelian22 = tanggalPembelian22;
        this.qty22 = qty22;
        this.brg22 = Barang22;
    }

    void tampilDataTransaksi() {
        System.out.println("Kode Transaksi: " + kodeTransaksi22);
        System.out.println("Nama Pembeli: " + namaPembeli22);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian22);
        System.out.println("Jumlah Barang: " + qty22);
        System.out.println("Kode Barang: " + brg22.kodeBarang1922);
        System.out.println("Nama Barang: " + brg22.nama1922);
        System.out.println("Kategori Barang: " + brg22.kategori1922);
        System.out.println("Stok Barang: " + brg22.stok1922);
        System.out.println("Harga Barang: " + brg22.harga1922);
    }
}