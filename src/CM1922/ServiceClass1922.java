package CM1922;
import java.util.Scanner;

public class ServiceClass1922 {
    Scanner sultanala = new Scanner(System.in);
    transaksiPembelian1922[] trs;
    int index;
    
    void tambahDataTransaksi22(transaksiPembelian1922 trp){
        System.out.println();
    }

    void searching(){
        System.out.print("masukkan kode transaksi yang dicari: ");
        String cari = sultanala.nextLine();
        for (int i = 0; i < 5 ; i ++) {
            if (trs[i].kodeTransaksi22.equalsIgnoreCase(cari)) {
                System.out.println("trasaksi ditemukan");
                trs[i].tampilDataTransaksi();
                
            }
        }
        
    }

    void shorting(){ 


    }
}
