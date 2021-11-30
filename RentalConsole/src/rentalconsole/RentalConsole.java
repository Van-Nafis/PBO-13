/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.ChronoUnit;
import rentalconsole.Member.*;
import rentalconsole.Waktu;

/**
 *
 * @author Acer
 */
public class RentalConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);    
               
                
        System.out.println("Masukan ID Member         : ");
        String id = input.nextLine();
        System.out.println("Masukan Tgl Pinjam(1-31)  : ");
        int tglpin = input.nextInt();
        System.out.println("Masukan Bln Pinjam(1-12)  : ");
        int blnpin = input.nextInt();
        System.out.println("Masukan Thn Pinjam        : ");
        int thnpin = input.nextInt();
        System.out.println("Masukan Tgl Kembali(1-31) : ");
        int tglkem = input.nextInt();
        System.out.println("Masukan Bln Kembali(1-12) : ");
        int blnkem = input.nextInt();
        System.out.println("Masukan Thn Kembali       : ");
        int thnkem = input.nextInt();
        
        // Data member
        DataMember dm = new DataMember();
        dm.tambahMember(new Member("M001", "Mr. X", "Silver"));
        dm.tambahMember(new Member("M002", "Mr. Y", "Gold"));
        dm.tambahMember(new Member("M003", "Mr. Z", "Platinum"));
        dm.cariMember(id);
        
        
        // Waktu pinjam
        Waktu w = new Waktu();
        w.lamaSewa(thnpin, blnpin, tglpin, thnkem, blnkem, tglkem);
        w.lamaSewaReturn(thnpin, blnpin, tglpin, thnkem, blnkem, tglkem);
        
        LocalDateTime pinjam = LocalDateTime.of(thnpin, blnpin, tglpin, 0, 0, 0);
        LocalDateTime kembali = LocalDateTime.of(thnkem, blnkem, tglkem, 0, 0, 0);
        int lama = (int) ChronoUnit.DAYS.between(pinjam, kembali);

        
        // Perhitungan dan Benefit        
        int index = -1;
        for(int i=0; i<dm.DataMember.size(); i++){
            if(dm.DataMember.get(i).IDMember.equals(id)){
                index = i;
                switch (dm.DataMember.get(i).JenisMember){
                    case "Silver":
                        Silver s = new Silver();
                        s.hitungBiaya(lama);
                        s.hitungPoin(lama);
                        break;
                    case "Gold":
                        Gold g = new Gold();
                        g.hitungBiaya(lama);
                        g.hitungPoin(lama);
                        g.cashback();
                        break;
                    case "Platinum":
                        Platinum p = new Platinum();
                        p.hitungBiaya(lama);
                        p.hitungPoin(lama);
                        p.cashback();
                        p.bonusPulsa(lama);
                        break;
                    default:
                        System.out.println("");
                        break;            
               
                
                }
            }
        }        
        
        
    }
    
}
