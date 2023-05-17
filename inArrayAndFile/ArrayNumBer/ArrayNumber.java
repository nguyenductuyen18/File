package File.inArrayAndFile.ArrayNumBer;

import java.io.*;

public class ArrayNumber {

    public static void main(String[] args) throws IOException {

        //khai báo 1 mảng
        int[] a = {1,2,3,4,8};
        //Khai báo File
        File file = new File("C:\\Users\\acer\\Desktop\\java\\File\\inArrayAndFile\\ArrayNumBer\\ArrayNumber.txt");
        // khai báo FileWriter để in vào File
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //vòng lặp for để in từng giá trị vào
        for (int i :a) {
            String b = String.valueOf(i);
            bufferedWriter.write(b);
            bufferedWriter.newLine();
        }
        //duyệt và dừng
      bufferedWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
// vòng lặp để in lại những giá trị có trong File
       int b = 0;
        while( (b=bufferedReader.read()) != -1){
            System.out.println((char) b);
       }
        bufferedReader.close();
    }
}
// sai vì ở vòng lặp cuối in ra các giá trị thì như là gán o = mảng a rùi in ra từng giá trị

