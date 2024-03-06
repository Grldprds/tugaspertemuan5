/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas5;

import java.util.Scanner;

/**
 *
 * @author Geral
 */
public class Soal1 {
    
    static void methodPertama(){
        System.out.println("Saya senang belajar bahasa Java");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan banyak teks : ");
        int n = scanner.nextInt();  
        
        for (int i = 0; i<n; i++){
            methodPertama();
        }
    }
    
}
