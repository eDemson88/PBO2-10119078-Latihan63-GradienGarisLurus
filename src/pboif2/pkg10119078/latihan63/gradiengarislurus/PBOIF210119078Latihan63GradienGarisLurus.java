/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119078.latihan63.gradiengarislurus;

/**
 *
 * @author ryzen
 */
public class PBOIF210119078Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat k = new Koordinat(2,10,5,7);
        System.out.println("Garis yang melalui titik (" + k.getX1() + "," + k.getY1() +") dan (" + k.getX2() + "," + k.getY2() + ") memiliki gradien sebesar " + k.hitungGradien());
    }
    
}
