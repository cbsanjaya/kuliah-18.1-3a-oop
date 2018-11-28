/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;

import java.util.Scanner;

/**
 *
 * @author cahya
 */
public class Percabangan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Angka 1!: ");
        int angka1 = scan.nextInt();

        System.out.print("Masukkan Angka 2!: ");
        int angka2 = scan.nextInt();
        
        System.out.print("Pilih Jenis Perhitungan: ");
        String jenis = scan.next();
        
        double hasil;
        
//        if ( "+".equals(jenis) ) {
//            hasil = angka1 + angka2;
//        } else
//        if ( "-".equals(jenis) ) {
//            hasil = angka1 - angka2;
//        } else
//        if ( "*".equals(jenis) ) {
//            hasil = angka1 * angka2;
//        } else
//        if ( "/".equals(jenis) ) {
//            hasil = angka1 / angka2;
//        } else {
//            hasil = 0;
//        }
            
        switch (jenis) {
            case "+":
                hasil = angka1 + angka2;
                break;
            case "-":
                hasil = angka1 - angka2;
                break;
            case "*":
                hasil = angka1 * angka2;
                break;
            case "/":
                hasil = angka1 / angka2;
                break;
            default:
                hasil = 0;
                break;
        }

        System.out.printf("Hasil dari %d %s %d Adalah: %.2f \n", 
                angka1, jenis, angka2, hasil);        
    }
}
