import model.Kubus;
import java.util.ArrayList;
import java.util.Scanner;
public class App{
    public static void main(String[] args) throws Exception{
        String pesan = "Selamat Datang di \"Kuliah PBO ";
        int tahun = 2022;
        String nama = "Karen Onggie 21SI1";
        System.out.println(pesan + tahun +"\"\n"+nama);
        System.out.print("==========================\n");
        //Scanner keyboard = new Scanner(System.in);
        //ArrayList<Long> input = new ArrayList<Long>();
        ArrayList<Long> output = new ArrayList<Long>();
        //input=Util.bacaFile();

        for(Long sisi: Util.bacaFile())
        {
            Kubus Kubus1 = new Kubus();
            Kubus1.s = sisi;
            //Kubus1.tampilkanLuas();
            //volume.add(sisi*sisi*sisi);
            //Long hitung = (sisi*sisi*sisi);
            Long hitung=Kubus1.tampilkanVolume();
            String hasil = Long.toString(hitung);
            output.add(Long.parseLong(hasil));
            //System.out.println(data1);
        }
        //System.out.println(volume);
        Util.tulisFile(output);
        

        /*System.out.print("Masukkan nilai s = ");
        Kubus1.s = keyboard.nextInt();
        Kubus1.tampilkanLuas();
        Kubus1.tampilkanVolume();*/


    }



}