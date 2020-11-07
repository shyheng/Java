package io.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 循环改进
 */
public class FileInputStream2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("F:\\自动办公软件\\shy.txt");

/*            while (true){
                int rea = fis.read();
                if (rea == -1){
                    break;
                }
                System.out.println(rea);
            }*/

//            改造while循环
            int  rr = 0 ;
            while ((rr = fis.read())!=-1){
                System.out.println(rr);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
