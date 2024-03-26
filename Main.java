package main;

import java.util.Scanner;

class PersegiPanjang {

    private int panjang;
    private int lebar;

    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int p) {
        panjang = p;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int l) {
        lebar = l;
    }

    public int hitungLuas() {
        return panjang * lebar;
    }

    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public void informasiPersegiPanjang() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar: " + lebar);
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }

    public void informasiLuas() {
        System.out.println("Luas: " + hitungLuas());
    }

    public void informasiKeliling() {
        System.out.println("Keliling: " + hitungKeliling());
    }

    public static void main(String[] args) {
        PersegiPanjang persegiPanjang1 = new PersegiPanjang(1, 1);
        PersegiPanjang persegiPanjang2 = new PersegiPanjang(30, 40);
        PersegiPanjang persegiPanjang3 = new PersegiPanjang(25, 35);

        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Informasi Seluruh Persegi Panjang");
            System.out.println("2. Informasi Luas Setiap Persegi Panjang");
            System.out.println("3. Informasi Keliling Setiap Persegi Panjang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("\nInformasi Seluruh Persegi Panjang:");
                    System.out.println("\nInformasi Persegi Panjang 1:");
                    persegiPanjang1.informasiPersegiPanjang();
                    System.out.println("\nInformasi Persegi Panjang 2:");
                    persegiPanjang2.informasiPersegiPanjang();
                    System.out.println("\nInformasi Persegi Panjang 3:");
                    persegiPanjang3.informasiPersegiPanjang();
                    break;
                case 2:
                    System.out.println("\nInformasi Luas Setiap Persegi Panjang:");
                    System.out.println("\nInformasi Luas Persegi Panjang 1:");
                    persegiPanjang1.informasiLuas();
                    System.out.println("\nInformasi Luas Persegi Panjang 2:");
                    persegiPanjang2.informasiLuas();
                    System.out.println("\nInformasi Luas Persegi Panjang 3:");
                    persegiPanjang3.informasiLuas();
                    break;
                case 3:
                    System.out.println("\nInformasi Keliling Setiap Persegi Panjang:");
                    System.out.println("\nInformasi Keliling Persegi Panjang 1:");
                    persegiPanjang1.informasiKeliling();
                    System.out.println("\nInformasi Keliling Persegi Panjang 2:");
                    persegiPanjang2.informasiKeliling();
                    System.out.println("\nInformasi Keliling Persegi Panjang 3:");
                    persegiPanjang3.informasiKeliling();
                    break;
                case 0:
                    System.out.println("\nKeluar.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}
