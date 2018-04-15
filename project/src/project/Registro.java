/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import frame_clases.Dueño;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.*;
//import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author casa
 */
public class Registro {
    private int list=0,edad;
    private Dueño nuevo;
    private String nombreR,fechaN,CONTRASEÑA,nombreU;
    private ArrayList <Dueño> tempA=new ArrayList<>();
    public void list() throws IOException{
        File nuevo=new File("Lista.txt");
        FileWriter nuevoO=new FileWriter(nuevo,true);
        BufferedWriter nuevo1=new BufferedWriter(nuevoO);
        if(nuevo.exists())
        {   nuevo1.write(String.valueOf(list));
            nuevo1.close();
        }
        
    }
    public Registro(int edad, String nombre_real,String fecha_de_nacimiento,String contraseña,String nombre_de_usuario)
    {
        
        this.edad=edad;
        nombreR=nombre_real;
        fechaN=fecha_de_nacimiento;
        CONTRASEÑA=contraseña;
        nombreU=nombre_de_usuario;
        nuevo=new Dueño(edad,nombreR,fechaN,CONTRASEÑA,nombreU);
        
    }
    public void add(){
        
        tempA.add(nuevo);
        
    
    }
    public void install(){
       
        
        File archivo=new File(tempA.get(list).getNombre_de_Usuario()+".txt");
        FileOutputStream salida=null;
        FileInputStream entrada=null;
        ObjectInputStream writer=null;
        ObjectOutputStream reader=null;
        
        try {
            archivo.createNewFile();
            salida=new FileOutputStream(archivo,true);
            reader=new ObjectOutputStream(salida);
            
            reader.writeObject(tempA.get(list));
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
        list++;
        }     
}
