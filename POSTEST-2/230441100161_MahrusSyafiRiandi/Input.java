/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 23-161 MAHRUS S.R
 */
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukan angka pertama : ");
            double num1 = scanner.nextDouble();

            System.out.print("Masukan angka kedua : ");
            double num2 = scanner.nextDouble();

            System.out.println("Pilih Operasi :");
            System.out.println("1. Tambah (+)");
            System.out.println("2. Kurang (-)");
            System.out.println("3. Kali (*)");
            System.out.println("4. Bagi (/)");
            System.out.print("Input pilihan anda : ");
            int choice = scanner.nextInt();

            double result = 0;

            Kalkulator operation;

            switch (choice) {
                case 1 -> {
                    operation = new Addition();
                    result = operation.calculate(num1, num2);
                }
                case 2 -> {
                    operation = new Subtraction();
                    result = operation.calculate(num1, num2);
                }
                case 3 -> {
                    operation = new Multiplication();
                    result = operation.calculate(num1, num2);
                }
                case 4 -> {
                    operation = new Division();
                    result = operation.calculate(num1, num2);
                    if (!Double.isNaN(result)) {
                        System.out.printf("Hasil : %.0f%n", result);
                    }
                    return;
                }
                default -> {
                    System.out.println("Pilihan Tidak valid");
                    return;
                }
            }
            if (result % 1 == 0) {
                System.out.printf("Hasil : %.0f%n", result);
            } else {
                System.out.println("Hasil : " + result);
            }
        }
    }
}
