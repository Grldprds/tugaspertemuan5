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
public class Soal2 {
    
    static void methodKedua(int n, int j){
        for(int i=n; i<=j; i++){
           if(i%2 == 0)
            System.out.println(""+i);
        }
    }
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Batas Awal : ");
        int n = scanner.nextInt();   
        
        System.out.println("Masukkan Batas Akhir : ");
        int j = scanner.nextInt();    
    
        methodKedua(n, j);
        }
    }
    

