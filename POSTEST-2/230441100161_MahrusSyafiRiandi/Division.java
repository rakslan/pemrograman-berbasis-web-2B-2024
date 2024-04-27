/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 23-161 MAHRUS S.R
 */
// Division.java
class Division extends Kalkulator {
    @Override
    double calculate(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: angka tidak boleh kosong");
            return Double.NaN;
        }
        return num1 / num2;
    }
}
