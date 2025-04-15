package CM1922;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sultanala = new Scanner(System.in);
        int pilihan;

        barang1922[] arrayBarang = new barang1922[5];
        transaksipembelian1922[] arrayTransaksi = new transaksipembelian1922[5];

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

            switch (pilihan) {
                case 1:
                    arrayBarang[0] = new barang1922("Br001", "Leo Keripik", "Makanan", 10, 1000);
                    arrayBarang[1] = new barang1922("Br002", "You C1000 Botol", "Minuman", 10, 7000);
                    arrayBarang[2] = new barang1922("Br003", "Teh Pucuk Botol", "Minuman", 10, 4000);
                    arrayBarang[3] = new barang1922("Br004", "Rinso Cair", "Sabun", 10, 7000);
                    arrayBarang[4] = new barang1922("Br005", "Mama Lemon Cair", "Sabun", 10, 1000);
                    for (int i = 0; i < arrayBarang.length; i++) {
                        arrayBarang[i].tampilDataBarang();
                    }
                    break;
                case 2:

                case 3:

                case 4:

                case 5:
                    break;
                
                default:
                    System.out.println("Menu Tidak Tersedia");
                    break;
            }
        }
    }
}
