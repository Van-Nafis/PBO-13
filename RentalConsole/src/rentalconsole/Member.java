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
public class Member {
    // Atribut
    String IDMember;
    String NamaMember;
    String JenisMember;
    
    // Constructor
    Member(String id, String nama, String jenis){
        IDMember = id;
        NamaMember = nama;
        JenisMember = jenis;
    }
    
    // Method
    void print(){
        System.out.println("--------------------------");
        System.out.println("ID Member: " + IDMember);
        System.out.println("Nama Member: " + NamaMember);
        System.out.println("Jenis Member: " + JenisMember);
    }
}
