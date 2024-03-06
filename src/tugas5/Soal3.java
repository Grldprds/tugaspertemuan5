/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class Soal3 {
    
     static int methodKetiga(int a, int b) {
        int gcd = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Bilangan Pertama : ");
        int a = scanner.nextInt();

        System.out.println("Masukkan Bilangan Kedua : ");
        int b = scanner.nextInt();

        int fpb = methodKetiga(a, b);

        System.out.println("Pembagi Bersama Terbesar dari " + a + " dan " + b + " adalah: " + fpb);
    }
   
}
