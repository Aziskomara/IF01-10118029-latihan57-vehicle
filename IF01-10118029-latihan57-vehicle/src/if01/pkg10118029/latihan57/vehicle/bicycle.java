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
public class bicycle extends vehicle{
    private int mygearcount;

    public bicycle() {
        setMybrand("Trek Bike");
        setMymodel("7.4FX");
        setMygearcount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : " + getMybrand());
        System.out.println("Model : " + getMymodel());
        System.out.println("Jumlah Gear : " + getMygearcount());
    }
    
    public int getMygearcount() {
        return mygearcount;
    }

    public void setMygearcount(int mygearcount) {
        this.mygearcount = mygearcount;
    }
    
    
}
