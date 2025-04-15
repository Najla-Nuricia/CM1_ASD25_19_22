package CM1922;
import java.util.Scanner;

public class ServiceClass1922 {
    Scanner sultanala = new Scanner(System.in);
    transaksiPembelian1922[] trs;
    int index;
    
    void tambahDataTransaksi22(transaksiPembelian1922 trp){
        trs[index] = trp;
        index++;
    }


    void setTransaksi(transaksiPembelian1922[] data) {
        this.trs = data;
    }

    void searching(){
        System.out.print("masukkan kode transaksi yang dicari: ");
        String cari = sultanala.nextLine();
        boolean ada = false;
        for (int i = 0; i < 5 ; i ++) {
            if (trs[i].kodeTransaksi22.equalsIgnoreCase(cari)) {
                ada = true;
                System.out.println("trasaksi ditemukan");
                trs[i].tampilDataTransaksi();
                break;
            }
        }

        if (!ada) {
            System.out.println("tidak ada transaksi dengan kode " + cari);
        }
        
    }

    void sorting() {
        for (int i = 0; i < index - 1; i++) {
            for (int j = 0; j < index - i - 1; j++) {
                if (trs[j].kodeTransaksi22.compareTo(trs[j + 1].kodeTransaksi22) < 0) {
                    transaksiPembelian1922 temp = trs[j];
                    trs[j] = trs[j + 1];
                    trs[j + 1] = temp;
                }
            }
        }

        System.out.println("Data transaksi telah diurutkan berdasarkan kode transaksi.");
    }
}    
