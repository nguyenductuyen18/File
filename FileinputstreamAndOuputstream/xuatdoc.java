package File.FileinputstreamAndOuputstream;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class xuatdoc {
    public static void main(String[] args)throws IOException {

        System.out.println("nhap du lieu");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.nextLine();
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\acer\\Desktop\\java\\File\\FileinputstreamAndOuputstream\\xuat.txt");
        fileOutputStream.write(i.getBytes());
        System.out.println("thanh cong");
        fileOutputStream.close();
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\acer\\Desktop\\java\\File\\FileinputstreamAndOuputstream\\xuat.txt");
            fileInputStream.read(i.getBytes());
                System.out.println(i);
            fileInputStream.close();
        }



}
