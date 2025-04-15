package CM1922;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sultanala = new Scanner(System.in);
        int pilihan;

        barang1922[] arrayBarang = new barang1922[5];
        transaksiPembelian1922[] arrayTransaksi = new transaksiPembelian1922[5];
        ServiceClass1922 service = new ServiceClass1922();

        while (true) {
            System.out.println("================TOKO Manasuka================");
            System.out.println("BANK MENU:");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Choose Menu(1-5): ");
            pilihan = sultanala.nextInt();
            sultanala.nextLine();

                    arrayBarang[0] = new barang1922("Br001", "Leo Keripik", "Makanan", 10, 1000);
                    arrayBarang[1] = new barang1922("Br002", "You C1000 Botol", "Minuman", 10, 7000);
                    arrayBarang[2] = new barang1922("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
                    arrayBarang[3] = new barang1922("Br004", "Rinso Cair", "Sabun", 10, 7000);
                    arrayBarang[4] = new barang1922("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);

                    arrayTransaksi[0] = new transaksiPembelian1922("TR01", "santi", "21-04-2024", 1, arrayBarang[0] );
                    arrayTransaksi[1] = new transaksiPembelian1922("TR02", "vani", "21-04-2024", 1, arrayBarang[1] );
                    arrayTransaksi[2] = new transaksiPembelian1922("TR03", "siska", "23-04-2024", 1, arrayBarang[2] );
                    arrayTransaksi[3] = new transaksiPembelian1922("TR04", "meimei", "23-04-2024", 1, arrayBarang[3] );
                    arrayTransaksi[4] = new transaksiPembelian1922("TR05", "ihsan", "24-04-2024", 1, arrayBarang[4] );

            switch (pilihan) {
                case 1:
                    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n" , "kode barang", "nama", "kategori", "stok", "harga");
                    
                    for (int i = 0; i < arrayBarang.length; i++) {
                        arrayBarang[i].tampilDataBarang();
                    }
                    break;
                case 2:
                    System.out.printf("%-15s %-15s  %-15s %-15s %-15s %-15s\n", "kode transaksi", "nama pembeli" , "tanggal pembelian" , "nama barang", "kuantitas", "harga");
                    
                    for (int i = 0; i < arrayTransaksi.length;i++) {
                        arrayTransaksi[i].tampilDataTransaksi();
                    }
                    break;
                case 3:
                    service.setTransaksi(arrayTransaksi);
                    service.searching();
                    break;
                case 4:
                    service.sorting();
                    break;
                case 5:
                    return;
                
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
        }
    }
}
