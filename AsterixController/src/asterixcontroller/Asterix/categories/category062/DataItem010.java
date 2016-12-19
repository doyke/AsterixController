/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.Asterix.categories.category062;

import javolution.io.Struct;

/**
 *
 * @author dgerontop
 */
public class DataItem010 extends Struct {
    
    Unsigned8 sac = new Unsigned8();
    Unsigned8 sic = new Unsigned8();

    public Unsigned8 getSac() {
        return sac;
    }

    public void setSac(Unsigned8 sac) {
        this.sac = sac;
    }

    public Unsigned8 getSic() {
        return sic;
    }

    public void setSic(Unsigned8 sic) {
        this.sic = sic;
    }
    
    
    
}
