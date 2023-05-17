package File.mot;


import java.io.*;
import java.util.Scanner;


public class ReadFileExample {
    public static void main(String[] args) {
        int so[]= {5,3,6,1,8};

        int tong=0;
        for (int i : so){
tong+=i;

        }
//        System.out.println(tong);}


String a = String.valueOf(tong);

        try {
            FileWriter file = new FileWriter("C:\\Users\\acer\\Desktop\\java\\File\\mot\\text2.txt");
            BufferedWriter bw = new BufferedWriter(file);
                bw.write(a);
                bw.newLine();

            bw.close();
            file.close();
        }catch (Exception e){
            e.getMessage();
        }


}
}
