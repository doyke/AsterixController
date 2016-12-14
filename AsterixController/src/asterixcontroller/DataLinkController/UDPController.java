/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller.DataLinkController;

import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author Gerontopoulos Dimitrios <jim_oldbird1298 at hotmail.gr>
 * 
 * H parakatw Class antiprwswpeuei ena Controller
 * 
 */
public class UDPController {
    
    public DatagramSocket sock = null;
    
    public UDPController(int socket) throws SocketException {
        
        sock = new DatagramSocket(socket);
    
    }
    
    
    
}
