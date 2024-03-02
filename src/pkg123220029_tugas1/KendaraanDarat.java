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

public abstract class KendaraanDarat implements Kendaraan{
    @Override
    public void bergerak(){
        System.out.println("Ini kendaraan darat. Bergerak di jalan");
    }
    public abstract void info();
}