/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.Asterix.categories;

import javolution.io.Struct;

/**
 *
 * @author Gerontopoulos Dimitrios <jim_oldbird1298 at hotmail.gr>
 */
public class FRN extends Struct {

    private final Unsigned8[] frn1 = {new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1),
        new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1)};
    private final Unsigned8[] frn2 = {new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1),
        new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1)};
    private final Unsigned8[] frn3 = {new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1),
        new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1)};
    private final Unsigned8[] frn4 = {new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1),
        new Unsigned8(1), new Unsigned8(1), new Unsigned8(1), new Unsigned8(1)};
    
    public boolean isExtended(Unsigned8[] a) {
        return a[7].get() == 1;
    }
    
    

}
