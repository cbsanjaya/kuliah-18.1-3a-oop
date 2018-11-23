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
public class Persegi {
    int panjang;
    int lebar;
    
    void setNilai(int p, int l) {
        panjang = p;
        lebar = l;
    }
    
    int getLuas() {
        return panjang * lebar;
    }
}
