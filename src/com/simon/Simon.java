package com.simon;

import java.util.Scanner;

public class Simon {
    public static void main(String[] args) {
    
    // membuat CALCULATOR variabel input dari Scanner
    Scanner inputUser = new Scanner(System.in);

    //PERSEGI
    System.out.println("=============== PERSEGI ============");
    
    System.out.print("Masukkan Nilai Sisi : ");
    int angka1 = inputUser.nextInt();
    
    int rumus1 = angka1 * angka1;
    
    System.out.println("Hasil perhitungan = " + rumus1);

    //SEGITIGA SAMA KAKI
    System.out.println("\n=============== SEGITIGA SAMA KAKI ============");
    
    System.out.print("Masukan Nilai Alas : ");
    int alas = inputUser.nextInt();
    
    System.out.print("Masukan Nilai Tinggi : ");
    int tinggi = inputUser.nextInt();
    
    int rumus2 = alas * tinggi / 2;
    
    System.out.println("Hasil Perhitungan = " + rumus2);
    
    //LINGKARAN
    System.out.println("\n=============== LINGKARAN ============");
    
    System.out.print("Masukan Nilai Diameter : ");
    int diameter = inputUser.nextInt();
    
    double r = diameter / 2;
    System.out.println("Jari-jarinya adalah = " + r );

    double rumus3 = 3.14 * r * r;

    System.out.println("Hasil Perhitungan = " + rumus3);

    //VOLUME KUBUS
    System.out.println("\n=============== VOLUME KUBUS ============");

    System.out.print("Masukan Nilai Sisi = ");
    int sisi = inputUser.nextInt();

    int rumus4 = sisi * sisi * sisi;

    System.out.println("Hasil Perhitungan adalah = " + rumus4);

    System.out.println("\n=============== PROGRAM SELESAI ============\n");

    // close scanner
    inputUser.close();
    }
}
