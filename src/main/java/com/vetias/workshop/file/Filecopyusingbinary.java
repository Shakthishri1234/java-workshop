package com.vetias.workshop.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Filecopyusingbinary {
    public static void main(String[] args) {
        try (FileInputStream inputStream=new FileInputStream("");
            FileOutputStream outputStream=new FileOutputStream("null")){
            byte[]chunk = new byte[1024];
            int byteRead;
            while((byteRead=inputStream.read(chunk)) != -1){
                outputStream.write(chunk,0,byteRead);
            }
          
        }catch(IOException e){
            System.out.println("error is reading or writting file");
        }
            
    }

}
