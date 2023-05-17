package File.baiTapFile;

import java.io.*;

public class class1 {
    public static void main(String[] args) throws IOException {


            FileReader file = new FileReader("C:\\Users\\acer\\Desktop\\java\\File\\baiTapFile\\class.txt");
            BufferedReader br = new BufferedReader(file);

           String i ;
           i = br.readLine();
                System.out.print( i);

            file.close();



}}
