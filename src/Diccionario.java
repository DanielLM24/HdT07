/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Santiago
 */

import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class Diccionario {
    private File txt;
    private BinaryTree<String> arbol;
    
    private Diccionario(String nombre){
        
        try{
            txt = new File(nombre);
        }
        catch(NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No existe el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        System.exit(0);
        }
        
    }
}
