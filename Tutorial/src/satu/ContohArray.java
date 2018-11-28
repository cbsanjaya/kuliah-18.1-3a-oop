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
public class ContohArray {
    public static void main(String[] args) {
        int[] nomer = {1,2,3,4,5,6,7,8,9};
//        System.out.println(nomer[5]);
        
        int[] nomer2 = {1,2,3,4};
        
        int[][] duaDimensi = {{1,2,3},{4,5,6}};
        
//        System.out.println(duaDimensi[1][2]);
//        System.out.println(duaDimensi[0][1]);
        
        int[] kosong = new int[50];
        
        kosong[7] = 500;
        
        System.out.println(kosong[7]);
    }
}
