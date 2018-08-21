/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet9;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Latihan4 {     
    public static void hitung(double a, double b){
        System.out.println("Kecepatan: " + (a / b) + "km/jam");
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan jarak: ");
        double bil1 = input.nextDouble();
        System.out.print("Masukkan waktu tempuh: ");
        double bil2 = input.nextDouble();
        hitung(bil1, bil2);
    }
}   