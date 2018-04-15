/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import frame_clases.Dueño;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author casa
 */
public class TEst2 {
public void next(){
File archivo=new File("m.txt");
        FileOutputStream salida=null;
        FileInputStream entrada=null;
        ObjectInputStream writer=null;
        ObjectOutputStream reader=null;
        Dueño temop=null;
        ArrayList <Dueño> tempA=new ArrayList<>();
        try {
            archivo.createNewFile();
            salida=new FileOutputStream(archivo,true);
            reader=new ObjectOutputStream(salida);
            temop=new Dueño();
            reader.writeObject(temop);
        } catch (IOException ex) {
            Logger.getLogger(Dueño.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        if(salida!=null){
            try {
                salida.close();
                if(reader!=null){
                reader.close();
                }
            } catch (IOException ex) {
                Logger.getLogger(Dueño.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        };    
}
}
