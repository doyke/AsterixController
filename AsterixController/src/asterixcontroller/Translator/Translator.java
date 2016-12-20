/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.Translator;

import asterixcontroller.Asterix.categories.Categories;
import asterixcontroller.Asterix.categories.FRN;
import asterixcontroller.Asterix.categories.Length;
import javolution.io.Struct.Unsigned8;

/**
 *
 * @author Gerontopoulos Dimitrios <jim_oldbird1298 at hotmail.com>
 */
public class Translator {
    
    private FRN frn = new FRN();
    private int length;
    private final Categories cat = null;
    
    public void proccessIncomingData(byte[] array, int size) {
        
        length = size;
        System.out.printf("Category : %d", array[0]);
        Length l = new Length();
        l.setLength((short)(array[2] + array[3]));
        System.out.println(l);
        
//        for (byte r:array) {
//            System.out.println(r);
//        }
        
        
        
        
        
    }
    
}
