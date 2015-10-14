/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package copycaracteres2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ddizoya
 */
public class Copycaracteres2 {
    
    PrintWriter pw;
    BufferedReader br;

    String f1 = "/datos/local/ddizoya/Escritorio/texto10.txt";
    String f2 = "/datos/local/ddizoya/Escritorio/texto11.txt";
    File out, in;
    
    void lecturaYEscritura(){
        try {
            in = new File(f1);
            out = new File(f2);
            if (!out.exists())
                out.createNewFile();
            
            br = new BufferedReader(new FileReader(in));
            pw = new PrintWriter(out);
            
            String aux;
            while ((aux = br.readLine()) != null){
                pw.println(aux);   
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Copycaracteres2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Copycaracteres2.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                pw.close();
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Copycaracteres2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void main(String[] args) {
       Copycaracteres2 obj = new Copycaracteres2();
       obj.lecturaYEscritura();
    }
    
}
