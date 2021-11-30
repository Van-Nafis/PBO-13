/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

/**
 *
 * @author Acer
 */
public class Gold extends Silver{
    private int biaya;
    private double diskon;
    int cashback;
    
    public int getBiaya(){
        return 30000;
    }
    
    public double getDiskon(){
        return 0.02;
    }
    
    protected void hitungBiaya(int lamaSewa){
        int harga = getBiaya() * lamaSewa;
        double total = harga - (harga * getDiskon());
        System.out.println("------------------------");
        System.out.println("Total Sewa : Rp. "+ total);
    }
    
    protected void hitungPoin(int lamaSewa){
        poin = 5 * lamaSewa;
        System.out.println("Jumlah Poin : "+ poin);
    }    
    
    protected void cashback(){
        cashback = 5000;
        System.out.println("Jumlah Cashback : Rp. " + cashback);
    }
}
