/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asterixcontroller;

import asterixcontroller.DataLinkController.FileController;
import asterixcontroller.Translator.Translator;
import java.util.Scanner;

/**
 *
 * @author 1AKEDEEPROG2
 *
 * To parakatw programma einai h main method pou diaxeirizetai ton asterix
 * receiver. Pairnei arguments apo to pliktrologio -p <protocol>
 * -r <remote host to read>
 * -d <debug level>
 * -h <Help>
 */
public class AsterixController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String protocol = null;
        String remote = null;
        String help;
        int debug;

        //Handling keybord arguments
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                if (args[i].equals("-p")) {
                    protocol = args[i + 1];
                } else if (args[i].equals("-r")) {
                    remote = args[i + 1];
                } 

                System.out.println(args[i]);
            }
            if (protocol == null && remote == null ) {
                printHelp();
            }
        }

        Scanner input = new Scanner(System.in);
        String path;
        System.out.println("Enter a path : ");
        path = input.nextLine();

        FileController test = new FileController(path);
        byte[] buffer = new byte[1024];
        test.readData(buffer, path);
        Translator tr = new Translator();
        int size = 1024;
        tr.proccessIncomingData(buffer, size);
        
    }

    private static void printHelp() {
        System.out.println("Help will printed soon");

    }

}
