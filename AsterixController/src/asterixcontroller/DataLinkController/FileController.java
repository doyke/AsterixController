/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.DataLinkController;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javolution.io.Struct;
import javolution.io.Struct.Unsigned8;

/**
 *
 * @author dgerontop
 */
public class FileController {

    //private byte[] buffer = new byte[512];
    private InputStream input;

    public FileController(String path) {
        analyzePath(path);
    }

    public static void analyzePath(String path) {

        File name = new File(path);

        if (name.exists()) {
            System.out.printf("%s%s\n%s%s\n", "File at path : ", name.getName(), (name.isFile() ? "is a File " : "is not a File "),
                    (name.isDirectory() ? "is a directory" : "is not a directory"));

        }

        if (name.isDirectory()) {
            String[] directory = name.list();
            System.out.println("Listing Directory contents");

            for (String directoryName : directory) {
                System.out.println(directoryName);
            }
        }
    }

    public int readData(byte[] b, String path) {

        byte[] buffer = new byte[1024];
        int i,j = 0;
        
        try {
            input = new FileInputStream(path);
            
            while ((i = input.read()) != -1) {
                buffer[j] =  (byte)i;
                System.out.println(buffer[j]);
                j++;
            }

        } catch (FileNotFoundException ex) {

            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return j;

    }
}
