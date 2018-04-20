/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import frame_clases.Dueño;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

/**
 *
 * @author casa
 */
public class RecuperandoPassword {
    File archivo;
    ObjectInputStream oop;
    ObjectOutputStream oos; 
private Vector linaje =new Vector();
 private Dueño nuevo,tol;
    private String usuario,correo;
    public RecuperandoPassword(String u,String c)
    {
        usuario=u;
        correo=c;
        
    }
    
    public void Lectura_para_mascota()
    {   File archivo=new File(usuario);
        try{oop=new ObjectInputStream(new FileInputStream(archivo));
            linaje=(Vector)oop.readObject();
            oop.close();
    }catch(FileNotFoundException e ){}catch(ArrayIndexOutOfBoundsException e){}catch(IOException e){}catch(ClassNotFoundException e){}
    }
    
}
