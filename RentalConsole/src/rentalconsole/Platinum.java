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
public class Platinum extends Gold{
    private int biaya;
    private double diskon;
    int pulsa;
    
    public int getBiaya(){
        return 45000;
    }
    
    public double getDiskon(){
        return 0.03;
    }
    
    protected void hitungBiaya(int lamaSewa){
        int harga = getBiaya() * lamaSewa;
        double total = harga - (harga * getDiskon());
        System.out.println("------------------------");
        System.out.println("Total Sewa : Rp. "+ total);
    }
    
    protected void hitungPoin(int lamaSewa){
        poin = 10 * lamaSewa;
        System.out.println("Jumlah Poin : "+ poin);
    }    
    
    protected void cashback(){
        cashback = 10000;
        System.out.println("Jumlah Cashback : Rp. " + cashback);
    }
    
    protected void bonusPulsa(int lamaSewa){
        pulsa = 5000 * lamaSewa;
        System.out.println("Bonus Pulsa : Rp. "+ pulsa);
    }
}
