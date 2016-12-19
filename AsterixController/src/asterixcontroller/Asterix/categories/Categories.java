/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.Asterix.categories;

import javolution.io.Struct;

/**
 *
 * @author Gerontopoulos Dimitrios <jim_oldbird1298 at hotmail.com>
 */
public class Categories extends Struct {
    
    Unsigned8 cat = new Unsigned8();

    
    public Unsigned8 getCat() {
        return cat;
    }
    
    
    
}
