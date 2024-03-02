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
public class Mobil extends KendaraanDarat {
    String merek, warna, plat;
    int harga;
    public Mobil(String merek, String warna, String plat, int harga){
        this.merek = merek;
        this.warna = warna;
        this.plat = plat;
        this.harga = harga;
    }
    @Override
    public void info(){
        System.out.println("Merek Mobil : " + merek);
        System.out.println("Warna Mobil : " + warna);
        System.out.println("Plat Mobil : " + plat);
        System.out.println("Harga Mobil : $." + harga);
    }
    @Override
    public void klakson(String bunyi){
        System.out.println("Klakson Mobil " + merek + " berbunyi " + bunyi);
    }
    
}
