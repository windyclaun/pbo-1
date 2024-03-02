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
public class Motor extends KendaraanDarat {
    String merek, warna, plat;
    int harga;
    public Motor(String merek, String warna, String plat, int harga){
        this.merek = merek;
        this.warna = warna;
        this.plat = plat;
        this.harga = harga;
    }
    @Override
    public void info(){
        System.out.println("Merek Motor : "+merek);
        System.out.println("Warna Motor : "+warna);
        System.out.println("Plat Motor : "+plat);
        System.out.println("Harga Motor : $."+harga);
    }
    @Override
    public void klakson(String bunyi){
        System.out.println("Klakson Motor " + merek + " berbunyi " + bunyi);
    }
    
}
