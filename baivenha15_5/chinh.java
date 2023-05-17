package File.baivenha15_5;

import java.io.*;
import java.util.ArrayList;

public class chinh{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("C:\\Users\\acer\\Desktop\\java\\File\\baivenha15_5\\file.txt");
        Student[] students = new  Student[3];


        students[0] = new Student("tuyen",8);
        students[1] = new Student("byru",15);
        students[2] = new Student("pitt",80);


        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(students);
        System.out.println("Ghi dữ liệu thành công ");
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Student[] liseStudent;
        liseStudent =(Student[]) objectInputStream.readObject();
        for (Student st:
             liseStudent) {
            System.out.println(st.toString());
        }

//        vietThang(students);

    }

//    private static void vietThang(Student[] students) throws IOException {
//        FileOutputStream fileOutputStream;
//        File file;
//        file = new File("C:\\Users\\acer\\Desktop\\java\\File\\baivenha15_5\\hihi");
//        fileOutputStream = new FileOutputStream(file);
//        String a = students[1].toString();
//        fileOutputStream.write(a.getBytes());
//        fileOutputStream.close();
//    }

}
