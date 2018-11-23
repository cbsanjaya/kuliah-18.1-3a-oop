/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satu;

/**
 *
 * @author cahya
 */
public class Index {
    
    public static void main(String[] args) {
        System.out.println("Halo");
        
        Persegi psg = new Persegi();
        psg.lebar = 5;
        psg.panjang = 10;
        
        int luas = psg.panjang * psg.lebar;
        
        Persegi psg2 = new Persegi();
        
        psg2.setNilai(7, 13);
        
        luas = psg2.getLuas();
        
        
//        System.out.println(luas);
    }
}
