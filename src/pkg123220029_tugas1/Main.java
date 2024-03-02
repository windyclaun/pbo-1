/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123220029_tugas1;

/**
 *
 * @author Asus
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KendaraanDarat K[] = new KendaraanDarat[3];
        K[0] = new Mobil("Avanza", "Silver", "DK 2420 AB", 2000);
        K[0].info();
        K[0].bergerak();
        K[0].klakson("Tut tut");
        
        System.out.println("");
        K[1] = new Motor("Supra", "Hitam", "AB 5220 KD", 560);
        K[1].info();
        K[1].bergerak();
        K[1].klakson("Tit tit");
        System.out.println("");
        
        K[2] = new Sepeda("Polygon", "Hitam", "-" , 100);
        K[2].info();
        K[2].bergerak();
        K[2].klakson("Kring kring");
        
    }
}