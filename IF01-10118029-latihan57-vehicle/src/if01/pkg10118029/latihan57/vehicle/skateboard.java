/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan57.vehicle;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan Vehicle
 */
public class skateboard extends vehicle{
    private double myboardlength;

    public skateboard() {
        setMybrand("Ally Skate");
        setMymodel("Rocket");
        setMyboardlength(54.5);
        System.out.println("SkateBoard");
        System.out.println("Brand : " + getMybrand());
        System.out.println("Model : " + getMymodel());
        System.out.println("Panjangnya Board : " + getMyboardlength());
    }

    public double getMyboardlength() {
        return myboardlength;
    }

    public void setMyboardlength(double myboardlength) {
        this.myboardlength = myboardlength;
    }
    
    
}
