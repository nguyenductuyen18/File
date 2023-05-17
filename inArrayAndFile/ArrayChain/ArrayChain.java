package File.inArrayAndFile.ArrayChain;

import java.io.*;

public class ArrayChain {
    public static void main(String[] args) throws IOException {
        //Khai báo mảng chứa chuỗi
        String[] a = {"nguyễn ","đức ","tuyên"};
        File file = new File("C:\\Users\\acer\\Desktop\\java\\File\\inArrayAndFile\\ArrayChain\\ArrayChain.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String o :a){
            bufferedWriter.write(o);
            bufferedWriter.newLine();

        }
        bufferedWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
   String n = null;
   while (true){
       n = bufferedReader.readLine();
       if (n == null){
           break;
       }else {
           System.out.println(n);
       }
   }
        }
    }

// khi khai báo nếu nhập vào ko có newLine thì khi in ra sẽ hiện ra null
