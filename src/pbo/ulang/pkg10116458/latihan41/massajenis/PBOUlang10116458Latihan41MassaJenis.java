/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        Kubus kbs = new Kubus ();
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi : ");
        kbs.setSisi(sc.nextInt());
        System.out.print("Massa : ");
        kbs.setMassa(sc.nextInt());
        
        System.out.println("\n"+"======Hasil Perhitungan======");
        System.out.println("Volume : " + kbs.hitungVolume(kbs.getSisi()));
        System.out.println("Massa Jenis : " + kbs.hitungMassaJenis(kbs.getMassa(),kbs.hitungVolume(kbs.getSisi())));
    }
    
}
