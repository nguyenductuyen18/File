package File.vietVaoFile;


import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.IllegalFormatCodePointException;

public class vietVaoFile {

    public static void main(String[] args) {

        try {



            FileWriter fw = new FileWriter("C:\\Users\\acer\\Desktop\\java\\File\\vietVaoFile\\gdgd.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("tuyendedVHGJKHKfghjptrai");


            bw.close();
            fw.close();



        } catch (IOException as) {

        }



    }
}
