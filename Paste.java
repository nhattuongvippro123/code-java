package baitap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
public class Paste {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
           File aFile = new File("C:\\paste1\\paste1.txt");
           File bFile = new File("C:\\paste2\\paste2.txt");
           bFile.createNewFile();
           is = new FileInputStream(aFile);
           os = new FileOutputStream(bFile);
           byte[] buffer = new byte[1024];
           int length;
           while ((length = is.read(buffer)) > 0) {
               os.write(buffer, 0, length);
           }
           is.close();
           os.close();
           System.out.println("\n\n\n\n\nSuccessfully!");
       } catch (Exception e) {
           e.printStackTrace();
       }
   }
}