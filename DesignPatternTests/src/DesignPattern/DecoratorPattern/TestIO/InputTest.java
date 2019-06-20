package DesignPattern.DecoratorPattern.TestIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jiangyayi on 19/6/11.
 */
public class InputTest {
    public static void main(String args[])throws IOException{
        int c;
        try {
            {
                InputStream in=new LowerInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

                while ((c=in.read())>0){
                    System.out.print((char)c);
                }
                in.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
