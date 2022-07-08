import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class Util {
    static String lokasiInput= "C:\\Users\\User\\Documents\\Documents\\UPH\\UPH aksel 22\\Pemrograman berorientasi objek\\Github\\pertemuan 13\\InputOutput(VolumeKubus)\\INPUT.md";
    static String lokasiOutput= "C:\\Users\\User\\Documents\\Documents\\UPH\\UPH aksel 22\\Pemrograman berorientasi objek\\Github\\pertemuan 13\\InputOutput(VolumeKubus)\\OUTPUT.md";
    static ArrayList<Long> input = new ArrayList<Long>();

    /*public static void init()
    {
        try{
            String path = new File(".").getCanonicalPath();
            lokasiInput = path + lokasiInput;
            lokasiOutput = path + lokasiOutput;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }

    }*/
    public static ArrayList<Long> bacaFile(){
        //init();
        //ArrayList<Long> number1 = new ArrayList<Long>();
        
        String data;
        FileReader fin=null;
        try {
            fin = new FileReader(lokasiInput);
            BufferedReader br = new BufferedReader(fin);
            do{
                data = br.readLine();
                if(data!=null)
                {
                    System.out.println(data);
                    input.add(Long.parseLong(data));
                    //System.out.println(input);
                } 
            }while(data!=null);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            //TODO: handle exception
        }
        finally{
            if(fin!=null){
                try {
                    fin.close();
                } catch (Exception e) {
                    //TODO: handle exception
                    System.out.println(e.getMessage());
                }
            }
        }
        return input;
    }


    public static void tulisFile(ArrayList<Long> output){
        //init();
        String Data1="";
        FileWriter fout=null;
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            fout=new FileWriter(lokasiOutput);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Data1="Hasil dari volume kubus adalah: \n";
            fout.write(Data1);
            for(Long numbers: output)
            {
                //Long hasil=numbers;
                fout.write(numbers + "\n");
            }
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        finally{
            if(fout!=null)
            {
                try{
                    //fout.write(Data1);
                    fout.close();
                }

                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}