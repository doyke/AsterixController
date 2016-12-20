/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.Asterix.categories;

import javolution.io.Struct;
import javolution.io.Struct.Unsigned8;

/**
 *
 * @author Gerontopoulos Dimitrios <jim_oldbird1298 at hotmail.com>
 */
public class Length extends Struct {

    Unsigned8 lenMSB = new Unsigned8();
    Unsigned8 lenLSB = new Unsigned8();
    

    public short getLength() {
        return (short) (lenMSB.get() << 8 | lenLSB.get());
    }

    public void setLength(short len) {
        this.lenMSB.set(((short) (len >> 8)));
        this.lenLSB.set((short) (len & 0xff));
    }

    @Override
    public String toString() {
        return "Length{" + "length=" + getLength() + '}';
    }
    
   
    
}
