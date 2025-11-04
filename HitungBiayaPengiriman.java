package LtihanUKL;

import java.util.Scanner;

public class HitungBiayaPengiriman {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("============= PROGRAM HITUNG BIAYA PENGIRIMAN =============");


        System.out.print("Masukkan berat barang (kg) : ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak pengiriman (km) : ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang paket (cm) : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar paket (cm) : ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi paket (cm) : ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi; // cm3

        double biayaPerKg; //biaya per kg berdasarakan jarak
        if (jarak <= 10 ) {
            biayaPerKg = 4250;
        }else {
            biayaPerKg = 6000;
        }

        double totalBiaya = berat * biayaPerKg;

        if (volume > 100) {
            totalBiaya += 50000;
        }
        System.out.println("____________________________________");
        System.out.println("Volume paket : " + volume + " cm3");
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        System.out.println("____________________________________");


    }
}
