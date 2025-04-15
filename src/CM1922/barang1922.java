package CM1922;

public class barang1922 {
    String kodeBarang1922;
    String nama1922;
    String kategori1922;
    int stok1922;
    int harga1922;

    barang1922(String kodeBarang1922,String nama1922,String kategori1922,int stok1922,int harga1922) {
        this.kodeBarang1922=kodeBarang1922;
        this.kategori1922=kategori1922;
        this.stok1922=stok1922;
        this.harga1922=harga1922;
    }

    void tampilDataBarang() {
       
        System.out.printf("%-15s %-15s %-15s %-15d %-15d\n" , kodeBarang1922, nama1922, kategori1922,stok1922,harga1922 );
    }
    
}
