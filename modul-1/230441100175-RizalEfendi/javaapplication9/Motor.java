/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

/**
 *
 * @author M S I
 */
import java.util.Scanner;

public class Motor {
    private static int jumlahMotor = 0;
    private String platNomor;
    private String merek;
    private int tahun;
    private double harga;
    private String warna;

    public Motor(String platNomor, String merek, int tahun, double harga, String warna) {
        this.platNomor = platNomor;
        this.merek = merek;
        this.tahun = tahun;
        this.harga = harga;
        this.warna = warna;
        jumlahMotor++;
    }

    public static int getTotalJumlahMotor() {
        return jumlahMotor;
    }

 
    public void tampilkanInfo() {
        System.out.println("Plat Nomor: " + platNomor);
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Warna: " + warna);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan plat nomor motor: ");
        String platNomor = scanner.nextLine();

        System.out.print("Masukkan merek motor: ");
        String merek = scanner.nextLine();

        System.out.print("Masukkan tahun pembuatan: ");
        int tahun = scanner.nextInt();

        System.out.print("Masukkan harga: Rp");
        double harga = scanner.nextDouble();

        System.out.print("Masukkan warna motor: ");
        scanner.nextLine();
        String warna = scanner.nextLine();

        
        Motor motor = new Motor(platNomor, merek, tahun, harga, warna);

        System.out.println("\nInformasi Motor:");
        motor.tampilkanInfo();

        System.out.println("\nTotal jumlah motor: " + Motor.getTotalJumlahMotor());

        scanner.close();
    }
}
