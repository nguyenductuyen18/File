package File.inArrayAndFile.Student;

import File.baivenha15_5.Student;

import java.io.*;

public class khaiBaoStudent {

    public static void main(String[] args) throws IOException {

            Student12 student12 = new  Student12(19,"tuyên","hehe");
            File file = new File("C:\\Users\\acer\\Desktop\\java\\File\\inArrayAndFile\\Student\\Student");
        FileWriter fileWriter = new FileWriter(file);

            fileWriter = new FileWriter(file);
            fileWriter.write(student12.toString());
            fileWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String p = bufferedReader.readLine();
        System.out.println(p);










    }}



