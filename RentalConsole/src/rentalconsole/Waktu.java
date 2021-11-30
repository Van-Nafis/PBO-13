/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;
import java.time.*;
/**
 *
 * @author Acer
 */
public class Waktu {
    void lamaSewa(int thnpin, int blnpin, int tglpin, int thnkem, int blnkem, int tglkem){
        LocalDateTime pinjam = LocalDateTime.of(thnpin, blnpin, tglpin, 0, 0, 0);
        LocalDateTime kembali = LocalDateTime.of(thnkem, blnkem, tglkem, 0, 0, 0);
        
        Duration lama = Duration.between(pinjam, kembali);
        
        System.out.println("-----------------------------------------");
        System.out.println("Tanggal Pinjam : "+ tglpin +"-"+ blnpin +"-"+ thnpin); 
        System.out.println("Tanggal Pinjam : "+ tglkem +"-"+ blnkem +"-"+ thnkem);
        System.out.println("Lama Sewa      : "+ lama.toDays() +" hari");
    }
    
    public Duration lamaSewaReturn(int thnpin, int blnpin, int tglpin, int thnkem, int blnkem, int tglkem){
        LocalDateTime pinjam = LocalDateTime.of(thnpin, blnpin, tglpin, 0, 0, 0);
        LocalDateTime kembali = LocalDateTime.of(thnkem, blnkem, tglkem, 0, 0, 0);
        
        Duration lama = Duration.between(pinjam, kembali);
        return lama;
    
    }
    
    
    
}
