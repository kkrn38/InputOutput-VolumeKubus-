package model;

public class Kubus {
    public Long s;
    public Long hitungLuas(){
        //6 * s2 10 => 600 100 60000
        //int luas = 6 * (s*s);
        return 6 * (s*s);//luas;
    }

    public Long hitungVolume(){
        //int volume = s*s*s;
        return s*s*s;//volume;
    }

    public void tampilkanLuas(){
        System.out.println("Luas Permukaan Kubus s = "+ s + " cm");
        //System.out.println("Luas = "+ hitungLuas());
    }

    /*public void tampilkanVolume(){
        System.out.println("Volume Kubus s = "+ s + " cm");
        System.out.println("Volume = "+ hitungVolume());
    }*/

    public Long tampilkanVolume(){
        //System.out.println(hitungVolume());
        return hitungVolume();
    }
    
}