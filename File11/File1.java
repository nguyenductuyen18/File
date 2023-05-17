package File.File11;

import java.io.File;

public class File1 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\acer\\Desktop\\java\\File\\File11\\File111.txt");
//        if (file.exists()){
//            System.out.println("File tồn tại ");
//        }else {
//            System.out.println("File ko tồn tại ");
//        }
//        if (file.isDirectory()){
//            System.out.println("File là thư mục ");
//        }else {
//            System.out.println("File ko thư mục");
//        }
       String filePath = file.getAbsolutePath();
        System.out.println("đường dẫn File"+ filePath);

    }
}
