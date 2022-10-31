/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaftarMenu;
import java.util.Scanner;
/**
 *
 * @author PC-A-30
 */
public class DaftarMenu {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
    int pilihan;
    char ulang;
    do {
      System.out.println("Daftar Menu Dealer Mobil");
      System.out.println("________________________");
      System.out.println("1. Nissan GTR R35 1,2 Milyar Rupiah");
      System.out.println("2. Toyota Supra MKV5 2,1 Milyar Rupiah");
      System.out.println("3. Lamborghini Aventador 8 Milyar Rupiah");
      System.out.println("4. BMW M4 GTS 6,3 Milyar Rupiah");
      System.out.println("5. Mclaren Senna 56 Milyar");
      System.out.println();
       
      System.out.print("Pilihan anda: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1:
          System.out.println("Anda memilih Nissan GTR R35");
          break;
        case 2:
          System.out.println("Anda memilih Toyota Supra MKV5");
          break;
        case 3:
          System.out.println("Anda memilih Lamborghini Aventador");
          break;
        case 4:
          System.out.println("Anda memilih BMW M4 GTS");
          break;
        case 5:
          System.out.println("Anda Mclaren Senna");
          break;
        default:
          System.out.println("Menu tidak tersedia");
      }
    
      System.out.println();
    
      System.out.print("Ingin memilih menu lain (y/t)? *note jika anda tidak memilihnya maka anda berhasil membeli mobil yang dipilih anda ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    }
    while (ulang!= 't');
    
    System.out.println("Terimakasih. Silahkan diambil mobil impian anda");
  
  }
}

