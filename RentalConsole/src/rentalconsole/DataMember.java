/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalconsole;
import java.util.ArrayList;
/**
 *
 * @author Acer
 */
public class DataMember {
    ArrayList<Member> DataMember = new ArrayList<Member>();
    
    void tambahMember(Member data){
        DataMember.add(data);
    }
    
    void cariMember(String id){
        boolean ditemukan = false;
        int index = -1;
        for(int i=0; i<DataMember.size(); i++){
            if(DataMember.get(i).IDMember.equals(id)){
                index = i;
                ditemukan = true;
            }
        }
        
        if(ditemukan==true){
            DataMember.get(index).print();
        } else {
            System.out.println("ID Member tidak ditemukan");
        }
    }
    

}
